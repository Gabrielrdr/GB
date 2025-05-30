/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.liferay.h7g5.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Brian Wing Shun Chan
 */
public class H7G5FolderNameException extends PortalException {

	public H7G5FolderNameException() {
	}

	public H7G5FolderNameException(String msg) {
		super(msg);
	}

	public H7G5FolderNameException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public H7G5FolderNameException(Throwable throwable) {
		super(throwable);
	}

}