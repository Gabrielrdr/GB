/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.H7G5EntryService;
import com.liferay.h7g5.service.base.H7G5EntryServiceBaseImpl;
import com.liferay.h7g5.service.persistence.H7G5EntryFinder;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.PrincipalException;

import java.util.List;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = {
		"json.web.service.context.name=ohqiwtsfhl",
		"json.web.service.context.path=H7G5Entry"
}, service = AopService.class)
public class H7G5EntryServiceImpl extends H7G5EntryServiceBaseImpl {

	public List<H7G5Entry> findH7G5EntriesByFolderIdWithDynamic(long folderId)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.findH7G5EntriesByFolderIdWithDynamic(folderId);
	}

	public H7G5Entry findH7G5EntryByKeyWithDynamic(String key)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.findH7G5EntriesByKeyWithDynamic(key);
	}

	public List<H7G5Entry> findH7G5EntriesByNameWithDynamic(String name)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}
		return h7g5EntryLocalService.findH7G5EntriesByNameWithDynamic(name);
	}

	public H7G5Entry findH7G5EntriesByHDNWithDynamic(long folderId, String description, String name)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.findH7G5EntriesByHDNWithDynamic(folderId, description, name);
	}


	//add by Gabriel Rodrigues

	public int getH7G5EntriesCount() {
		return h7g5EntryLocalService.getH7G5EntriesCount();
	}

	public H7G5Entry addMyCustomH7G5Entry(String name, String description) {
		long entryId = counterLocalService.increment();
	
		H7G5Entry entry = h7g5EntryLocalService.createH7G5Entry(entryId);
	
		entry.setName(name);
		entry.setDescription(description);
	
		return h7g5EntryLocalService.addH7G5Entry(entry);
	}
}
