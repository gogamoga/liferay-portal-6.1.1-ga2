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

package com.liferay.portal.service;

/**
 * <p>
 * This class is a wrapper for {@link UserGroupGroupRoleLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       UserGroupGroupRoleLocalService
 * @generated
 */
public class UserGroupGroupRoleLocalServiceWrapper
	implements UserGroupGroupRoleLocalService,
		ServiceWrapper<UserGroupGroupRoleLocalService> {
	public UserGroupGroupRoleLocalServiceWrapper(
		UserGroupGroupRoleLocalService userGroupGroupRoleLocalService) {
		_userGroupGroupRoleLocalService = userGroupGroupRoleLocalService;
	}

	/**
	* Adds the user group group role to the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupGroupRole the user group group role
	* @return the user group group role that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.UserGroupGroupRole addUserGroupGroupRole(
		com.liferay.portal.model.UserGroupGroupRole userGroupGroupRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.addUserGroupGroupRole(userGroupGroupRole);
	}

	/**
	* Creates a new user group group role with the primary key. Does not add the user group group role to the database.
	*
	* @param userGroupGroupRolePK the primary key for the new user group group role
	* @return the new user group group role
	*/
	public com.liferay.portal.model.UserGroupGroupRole createUserGroupGroupRole(
		com.liferay.portal.service.persistence.UserGroupGroupRolePK userGroupGroupRolePK) {
		return _userGroupGroupRoleLocalService.createUserGroupGroupRole(userGroupGroupRolePK);
	}

	/**
	* Deletes the user group group role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupGroupRolePK the primary key of the user group group role
	* @return the user group group role that was removed
	* @throws PortalException if a user group group role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.UserGroupGroupRole deleteUserGroupGroupRole(
		com.liferay.portal.service.persistence.UserGroupGroupRolePK userGroupGroupRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.deleteUserGroupGroupRole(userGroupGroupRolePK);
	}

	/**
	* Deletes the user group group role from the database. Also notifies the appropriate model listeners.
	*
	* @param userGroupGroupRole the user group group role
	* @return the user group group role that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.UserGroupGroupRole deleteUserGroupGroupRole(
		com.liferay.portal.model.UserGroupGroupRole userGroupGroupRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.deleteUserGroupGroupRole(userGroupGroupRole);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userGroupGroupRoleLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.portal.model.UserGroupGroupRole fetchUserGroupGroupRole(
		com.liferay.portal.service.persistence.UserGroupGroupRolePK userGroupGroupRolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.fetchUserGroupGroupRole(userGroupGroupRolePK);
	}

	/**
	* Returns the user group group role with the primary key.
	*
	* @param userGroupGroupRolePK the primary key of the user group group role
	* @return the user group group role
	* @throws PortalException if a user group group role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.UserGroupGroupRole getUserGroupGroupRole(
		com.liferay.portal.service.persistence.UserGroupGroupRolePK userGroupGroupRolePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.getUserGroupGroupRole(userGroupGroupRolePK);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user group group roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user group group roles
	* @param end the upper bound of the range of user group group roles (not inclusive)
	* @return the range of user group group roles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.UserGroupGroupRole> getUserGroupGroupRoles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.getUserGroupGroupRoles(start, end);
	}

	/**
	* Returns the number of user group group roles.
	*
	* @return the number of user group group roles
	* @throws SystemException if a system exception occurred
	*/
	public int getUserGroupGroupRolesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.getUserGroupGroupRolesCount();
	}

	/**
	* Updates the user group group role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userGroupGroupRole the user group group role
	* @return the user group group role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.UserGroupGroupRole updateUserGroupGroupRole(
		com.liferay.portal.model.UserGroupGroupRole userGroupGroupRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.updateUserGroupGroupRole(userGroupGroupRole);
	}

	/**
	* Updates the user group group role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userGroupGroupRole the user group group role
	* @param merge whether to merge the user group group role with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the user group group role that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.UserGroupGroupRole updateUserGroupGroupRole(
		com.liferay.portal.model.UserGroupGroupRole userGroupGroupRole,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.updateUserGroupGroupRole(userGroupGroupRole,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _userGroupGroupRoleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userGroupGroupRoleLocalService.setBeanIdentifier(beanIdentifier);
	}

	public void addUserGroupGroupRoles(long userGroupId, long groupId,
		long[] roleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.addUserGroupGroupRoles(userGroupId,
			groupId, roleIds);
	}

	public void addUserGroupGroupRoles(long[] userGroupIds, long groupId,
		long roleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.addUserGroupGroupRoles(userGroupIds,
			groupId, roleId);
	}

	public void deleteUserGroupGroupRoles(long userGroupId, long groupId,
		long[] roleIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.deleteUserGroupGroupRoles(userGroupId,
			groupId, roleIds);
	}

	public void deleteUserGroupGroupRoles(long userGroupId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.deleteUserGroupGroupRoles(userGroupId,
			groupIds);
	}

	public void deleteUserGroupGroupRoles(long[] userGroupIds, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.deleteUserGroupGroupRoles(userGroupIds,
			groupId);
	}

	public void deleteUserGroupGroupRoles(long[] userGroupIds, long groupId,
		long roleId) throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.deleteUserGroupGroupRoles(userGroupIds,
			groupId, roleId);
	}

	public void deleteUserGroupGroupRolesByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.deleteUserGroupGroupRolesByGroupId(groupId);
	}

	public void deleteUserGroupGroupRolesByRoleId(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.deleteUserGroupGroupRolesByRoleId(roleId);
	}

	public void deleteUserGroupGroupRolesByUserGroupId(long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userGroupGroupRoleLocalService.deleteUserGroupGroupRolesByUserGroupId(userGroupId);
	}

	public java.util.List<com.liferay.portal.model.UserGroupGroupRole> getUserGroupGroupRoles(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.getUserGroupGroupRoles(userGroupId);
	}

	public java.util.List<com.liferay.portal.model.UserGroupGroupRole> getUserGroupGroupRoles(
		long userGroupId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.getUserGroupGroupRoles(userGroupId,
			groupId);
	}

	public java.util.List<com.liferay.portal.model.UserGroupGroupRole> getUserGroupGroupRolesByGroupAndRole(
		long groupId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.getUserGroupGroupRolesByGroupAndRole(groupId,
			roleId);
	}

	public boolean hasUserGroupGroupRole(long userGroupId, long groupId,
		long roleId) throws com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.hasUserGroupGroupRole(userGroupId,
			groupId, roleId);
	}

	public boolean hasUserGroupGroupRole(long userGroupId, long groupId,
		java.lang.String roleName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userGroupGroupRoleLocalService.hasUserGroupGroupRole(userGroupId,
			groupId, roleName);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public UserGroupGroupRoleLocalService getWrappedUserGroupGroupRoleLocalService() {
		return _userGroupGroupRoleLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedUserGroupGroupRoleLocalService(
		UserGroupGroupRoleLocalService userGroupGroupRoleLocalService) {
		_userGroupGroupRoleLocalService = userGroupGroupRoleLocalService;
	}

	public UserGroupGroupRoleLocalService getWrappedService() {
		return _userGroupGroupRoleLocalService;
	}

	public void setWrappedService(
		UserGroupGroupRoleLocalService userGroupGroupRoleLocalService) {
		_userGroupGroupRoleLocalService = userGroupGroupRoleLocalService;
	}

	private UserGroupGroupRoleLocalService _userGroupGroupRoleLocalService;
}