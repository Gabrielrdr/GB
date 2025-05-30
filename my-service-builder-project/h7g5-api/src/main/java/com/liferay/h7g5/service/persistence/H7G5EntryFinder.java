/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public interface H7G5EntryFinder {

	public java.util.List<com.liferay.h7g5.model.H7G5Entry>
		findByH7G5EntryFolderId(long folderId);

	public com.liferay.h7g5.model.H7G5Entry findByKey(String key);

	public java.util.List<com.liferay.h7g5.model.H7G5Entry> findByName(
		String name);

	public com.liferay.h7g5.model.H7G5Entry findByHDN(
		long folderId, String description, String name);

}