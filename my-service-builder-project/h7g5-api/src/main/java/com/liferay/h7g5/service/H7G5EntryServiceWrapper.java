/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link H7G5EntryService}.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5EntryService
 * @generated
 */
public class H7G5EntryServiceWrapper
	implements H7G5EntryService, ServiceWrapper<H7G5EntryService> {

	public H7G5EntryServiceWrapper() {
		this(null);
	}

	public H7G5EntryServiceWrapper(H7G5EntryService h7g5EntryService) {
		_h7g5EntryService = h7g5EntryService;
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry addMyCustomH7G5Entry(
		String name, String description) {

		return _h7g5EntryService.addMyCustomH7G5Entry(name, description);
	}

	@Override
	public java.util.List<com.liferay.h7g5.model.H7G5Entry>
			findH7G5EntriesByFolderIdWithDynamic(long folderId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.findH7G5EntriesByFolderIdWithDynamic(folderId);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry findH7G5EntriesByHDNWithDynamic(
			long folderId, String description, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.findH7G5EntriesByHDNWithDynamic(
			folderId, description, name);
	}

	@Override
	public java.util.List<com.liferay.h7g5.model.H7G5Entry>
			findH7G5EntriesByNameWithDynamic(String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.findH7G5EntriesByNameWithDynamic(name);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry findH7G5EntryByKeyWithDynamic(
			String key)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.findH7G5EntryByKeyWithDynamic(key);
	}

	@Override
	public int getH7G5EntriesCount() {
		return _h7g5EntryService.getH7G5EntriesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _h7g5EntryService.getOSGiServiceIdentifier();
	}

	@Override
	public H7G5EntryService getWrappedService() {
		return _h7g5EntryService;
	}

	@Override
	public void setWrappedService(H7G5EntryService h7g5EntryService) {
		_h7g5EntryService = h7g5EntryService;
	}

	private H7G5EntryService _h7g5EntryService;

}