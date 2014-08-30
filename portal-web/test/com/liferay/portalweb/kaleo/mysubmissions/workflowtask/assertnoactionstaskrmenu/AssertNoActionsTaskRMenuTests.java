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

package com.liferay.portalweb.kaleo.mysubmissions.workflowtask.assertnoactionstaskrmenu;

import com.liferay.portalweb.portal.BaseTestSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class AssertNoActionsTaskRMenuTests extends BaseTestSuite {
	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTestSuite(ConfigureWebContentSingleApproverTest.class);
		testSuite.addTestSuite(AddWebContentTest.class);
		testSuite.addTestSuite(AssertNoAssignToMeTaskRMenuTest.class);
		testSuite.addTestSuite(AssignToMeTaskWebContentDetailsTest.class);
		testSuite.addTestSuite(AssertNoApproveTaskRMenuTest.class);
		testSuite.addTestSuite(AssertNoRejectTaskRMenuTest.class);
		testSuite.addTestSuite(RejectTaskWebContentDetailsTest.class);
		testSuite.addTestSuite(AssertNoResubmitTaskRMenuTest.class);
		testSuite.addTestSuite(TearDownWebContentTest.class);
		testSuite.addTestSuite(TearDownWorkflowConfigurationTest.class);

		return testSuite;
	}
}