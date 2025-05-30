/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.liferay.h7g5.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Brian Wing Shun Chan
 */
public class DuplicateH7G5EntryKeyException extends PortalException {

	public DuplicateH7G5EntryKeyException() {
	}

	public DuplicateH7G5EntryKeyException(String msg) {
		super(msg);
	}

	public DuplicateH7G5EntryKeyException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public DuplicateH7G5EntryKeyException(Throwable throwable) {
		super(throwable);
	}

}