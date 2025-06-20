/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link H7G5FolderService}.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5FolderService
 * @generated
 */
public class H7G5FolderServiceWrapper
	implements H7G5FolderService, ServiceWrapper<H7G5FolderService> {

	public H7G5FolderServiceWrapper() {
		this(null);
	}

	public H7G5FolderServiceWrapper(H7G5FolderService h7g5FolderService) {
		_h7g5FolderService = h7g5FolderService;
	}

	@Override
	public com.liferay.h7g5.model.H7G5Folder addMyCustomH7G5Folder(
		String description, String name) {

		return _h7g5FolderService.addMyCustomH7G5Folder(description, name);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Folder
			addMyCustomH7G5FolderWithPermissionCheck(
				String description, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5FolderService.addMyCustomH7G5FolderWithPermissionCheck(
			description, name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _h7g5FolderService.getOSGiServiceIdentifier();
	}

	@Override
	public H7G5FolderService getWrappedService() {
		return _h7g5FolderService;
	}

	@Override
	public void setWrappedService(H7G5FolderService h7g5FolderService) {
		_h7g5FolderService = h7g5FolderService;
	}

	private H7G5FolderService _h7g5FolderService;

}