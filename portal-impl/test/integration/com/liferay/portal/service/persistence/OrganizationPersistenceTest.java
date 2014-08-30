/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service.persistence;

import com.liferay.portal.NoSuchOrganizationException;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.impl.OrganizationModelImpl;
import com.liferay.portal.service.ServiceTestUtil;
import com.liferay.portal.service.persistence.BasePersistence;
import com.liferay.portal.service.persistence.PersistenceExecutionTestListener;
import com.liferay.portal.test.ExecutionTestListeners;
import com.liferay.portal.test.LiferayPersistenceIntegrationJUnitTestRunner;
import com.liferay.portal.test.persistence.TransactionalPersistenceAdvice;
import com.liferay.portal.util.PropsValues;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Brian Wing Shun Chan
 */
@ExecutionTestListeners(listeners =  {
	PersistenceExecutionTestListener.class})
@RunWith(LiferayPersistenceIntegrationJUnitTestRunner.class)
public class OrganizationPersistenceTest {
	@After
	public void tearDown() throws Exception {
		Map<Serializable, BasePersistence<?>> basePersistences = _transactionalPersistenceAdvice.getBasePersistences();

		Set<Serializable> primaryKeys = basePersistences.keySet();

		for (Serializable primaryKey : primaryKeys) {
			BasePersistence<?> basePersistence = basePersistences.get(primaryKey);

			try {
				basePersistence.remove(primaryKey);
			}
			catch (Exception e) {
				if (_log.isDebugEnabled()) {
					_log.debug("The model with primary key " + primaryKey +
						" was already deleted");
				}
			}
		}

		_transactionalPersistenceAdvice.reset();
	}

	@Test
	public void testCreate() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Organization organization = _persistence.create(pk);

		Assert.assertNotNull(organization);

		Assert.assertEquals(organization.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Organization newOrganization = addOrganization();

		_persistence.remove(newOrganization);

		Organization existingOrganization = _persistence.fetchByPrimaryKey(newOrganization.getPrimaryKey());

		Assert.assertNull(existingOrganization);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addOrganization();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Organization newOrganization = _persistence.create(pk);

		newOrganization.setCompanyId(ServiceTestUtil.nextLong());

		newOrganization.setParentOrganizationId(ServiceTestUtil.nextLong());

		newOrganization.setTreePath(ServiceTestUtil.randomString());

		newOrganization.setName(ServiceTestUtil.randomString());

		newOrganization.setType(ServiceTestUtil.randomString());

		newOrganization.setRecursable(ServiceTestUtil.randomBoolean());

		newOrganization.setRegionId(ServiceTestUtil.nextLong());

		newOrganization.setCountryId(ServiceTestUtil.nextLong());

		newOrganization.setStatusId(ServiceTestUtil.nextInt());

		newOrganization.setComments(ServiceTestUtil.randomString());

		_persistence.update(newOrganization, false);

		Organization existingOrganization = _persistence.findByPrimaryKey(newOrganization.getPrimaryKey());

		Assert.assertEquals(existingOrganization.getOrganizationId(),
			newOrganization.getOrganizationId());
		Assert.assertEquals(existingOrganization.getCompanyId(),
			newOrganization.getCompanyId());
		Assert.assertEquals(existingOrganization.getParentOrganizationId(),
			newOrganization.getParentOrganizationId());
		Assert.assertEquals(existingOrganization.getTreePath(),
			newOrganization.getTreePath());
		Assert.assertEquals(existingOrganization.getName(),
			newOrganization.getName());
		Assert.assertEquals(existingOrganization.getType(),
			newOrganization.getType());
		Assert.assertEquals(existingOrganization.getRecursable(),
			newOrganization.getRecursable());
		Assert.assertEquals(existingOrganization.getRegionId(),
			newOrganization.getRegionId());
		Assert.assertEquals(existingOrganization.getCountryId(),
			newOrganization.getCountryId());
		Assert.assertEquals(existingOrganization.getStatusId(),
			newOrganization.getStatusId());
		Assert.assertEquals(existingOrganization.getComments(),
			newOrganization.getComments());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Organization newOrganization = addOrganization();

		Organization existingOrganization = _persistence.findByPrimaryKey(newOrganization.getPrimaryKey());

		Assert.assertEquals(existingOrganization, newOrganization);
	}

	@Test
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		try {
			_persistence.findByPrimaryKey(pk);

			Assert.fail(
				"Missing entity did not throw NoSuchOrganizationException");
		}
		catch (NoSuchOrganizationException nsee) {
		}
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Organization newOrganization = addOrganization();

		Organization existingOrganization = _persistence.fetchByPrimaryKey(newOrganization.getPrimaryKey());

		Assert.assertEquals(existingOrganization, newOrganization);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Organization missingOrganization = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingOrganization);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Organization newOrganization = addOrganization();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Organization.class,
				Organization.class.getClassLoader());

		dynamicQuery.add(RestrictionsFactoryUtil.eq("organizationId",
				newOrganization.getOrganizationId()));

		List<Organization> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Organization existingOrganization = result.get(0);

		Assert.assertEquals(existingOrganization, newOrganization);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Organization.class,
				Organization.class.getClassLoader());

		dynamicQuery.add(RestrictionsFactoryUtil.eq("organizationId",
				ServiceTestUtil.nextLong()));

		List<Organization> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Organization newOrganization = addOrganization();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Organization.class,
				Organization.class.getClassLoader());

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"organizationId"));

		Object newOrganizationId = newOrganization.getOrganizationId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("organizationId",
				new Object[] { newOrganizationId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingOrganizationId = result.get(0);

		Assert.assertEquals(existingOrganizationId, newOrganizationId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Organization.class,
				Organization.class.getClassLoader());

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"organizationId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("organizationId",
				new Object[] { ServiceTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		if (!PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			return;
		}

		Organization newOrganization = addOrganization();

		_persistence.clearCache();

		OrganizationModelImpl existingOrganizationModelImpl = (OrganizationModelImpl)_persistence.findByPrimaryKey(newOrganization.getPrimaryKey());

		Assert.assertEquals(existingOrganizationModelImpl.getCompanyId(),
			existingOrganizationModelImpl.getOriginalCompanyId());
		Assert.assertTrue(Validator.equals(
				existingOrganizationModelImpl.getName(),
				existingOrganizationModelImpl.getOriginalName()));
	}

	protected Organization addOrganization() throws Exception {
		long pk = ServiceTestUtil.nextLong();

		Organization organization = _persistence.create(pk);

		organization.setCompanyId(ServiceTestUtil.nextLong());

		organization.setParentOrganizationId(ServiceTestUtil.nextLong());

		organization.setTreePath(ServiceTestUtil.randomString());

		organization.setName(ServiceTestUtil.randomString());

		organization.setType(ServiceTestUtil.randomString());

		organization.setRecursable(ServiceTestUtil.randomBoolean());

		organization.setRegionId(ServiceTestUtil.nextLong());

		organization.setCountryId(ServiceTestUtil.nextLong());

		organization.setStatusId(ServiceTestUtil.nextInt());

		organization.setComments(ServiceTestUtil.randomString());

		_persistence.update(organization, false);

		return organization;
	}

	private static Log _log = LogFactoryUtil.getLog(OrganizationPersistenceTest.class);
	private OrganizationPersistence _persistence = (OrganizationPersistence)PortalBeanLocatorUtil.locate(OrganizationPersistence.class.getName());
	private TransactionalPersistenceAdvice _transactionalPersistenceAdvice = (TransactionalPersistenceAdvice)PortalBeanLocatorUtil.locate(TransactionalPersistenceAdvice.class.getName());
}