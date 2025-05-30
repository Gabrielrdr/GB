/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for H7G5Entry. This utility wraps
 * <code>com.liferay.h7g5.service.impl.H7G5EntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5EntryService
 * @generated
 */
public class H7G5EntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.h7g5.service.impl.H7G5EntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static H7G5Entry addMyCustomH7G5Entry(
		String name, String description) {

		return getService().addMyCustomH7G5Entry(name, description);
	}

	public static List<H7G5Entry> findH7G5EntriesByFolderIdWithDynamic(
			long folderId)
		throws PortalException {

		return getService().findH7G5EntriesByFolderIdWithDynamic(folderId);
	}

	public static H7G5Entry findH7G5EntriesByHDNWithDynamic(
			long folderId, String description, String name)
		throws PortalException {

		return getService().findH7G5EntriesByHDNWithDynamic(
			folderId, description, name);
	}

	public static List<H7G5Entry> findH7G5EntriesByNameWithDynamic(String name)
		throws PortalException {

		return getService().findH7G5EntriesByNameWithDynamic(name);
	}

	public static H7G5Entry findH7G5EntryByKeyWithDynamic(String key)
		throws PortalException {

		return getService().findH7G5EntryByKeyWithDynamic(key);
	}

	public static int getH7G5EntriesCount() {
		return getService().getH7G5EntriesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static H7G5EntryService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<H7G5EntryService> _serviceSnapshot =
		new Snapshot<>(H7G5EntryServiceUtil.class, H7G5EntryService.class);

}