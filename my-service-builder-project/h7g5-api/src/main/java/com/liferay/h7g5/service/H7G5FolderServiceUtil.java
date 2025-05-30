/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service;

import com.liferay.h7g5.model.H7G5Folder;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

/**
 * Provides the remote service utility for H7G5Folder. This utility wraps
 * <code>com.liferay.h7g5.service.impl.H7G5FolderServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5FolderService
 * @generated
 */
public class H7G5FolderServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.h7g5.service.impl.H7G5FolderServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static H7G5Folder addMyCustomH7G5Folder(
		String description, String name) {

		return getService().addMyCustomH7G5Folder(description, name);
	}

	public static H7G5Folder addMyCustomH7G5FolderWithPermissionCheck(
			String description, String name)
		throws PortalException {

		return getService().addMyCustomH7G5FolderWithPermissionCheck(
			description, name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static H7G5FolderService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<H7G5FolderService> _serviceSnapshot =
		new Snapshot<>(H7G5FolderServiceUtil.class, H7G5FolderService.class);

}