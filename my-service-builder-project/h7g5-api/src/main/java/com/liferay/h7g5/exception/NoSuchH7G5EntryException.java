/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.liferay.h7g5.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchH7G5EntryException extends NoSuchModelException {

	public NoSuchH7G5EntryException() {
	}

	public NoSuchH7G5EntryException(String msg) {
		super(msg);
	}

	public NoSuchH7G5EntryException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchH7G5EntryException(Throwable throwable) {
		super(throwable);
	}

}