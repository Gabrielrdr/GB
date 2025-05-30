/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the H7G5Folder service. Represents a row in the &quot;OHQIWTSFHL_H7G5Folder&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5FolderModel
 * @generated
 */
@ImplementationClassName("com.liferay.h7g5.model.impl.H7G5FolderImpl")
@ProviderType
public interface H7G5Folder extends H7G5FolderModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.h7g5.model.impl.H7G5FolderImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<H7G5Folder, Long> H7G5_FOLDER_ID_ACCESSOR =
		new Accessor<H7G5Folder, Long>() {

			@Override
			public Long get(H7G5Folder h7g5Folder) {
				return h7g5Folder.getH7g5FolderId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<H7G5Folder> getTypeClass() {
				return H7G5Folder.class;
			}

		};

}