/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.http;

import com.liferay.h7g5.service.H7G5FolderServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>H7G5FolderServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class H7G5FolderServiceHttp {

	public static com.liferay.h7g5.model.H7G5Folder addMyCustomH7G5Folder(
		HttpPrincipal httpPrincipal, String description, String name) {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5FolderServiceUtil.class, "addMyCustomH7G5Folder",
				_addMyCustomH7G5FolderParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, description, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Folder)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Folder
			addMyCustomH7G5FolderWithPermissionCheck(
				HttpPrincipal httpPrincipal, String description, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5FolderServiceUtil.class,
				"addMyCustomH7G5FolderWithPermissionCheck",
				_addMyCustomH7G5FolderWithPermissionCheckParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, description, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Folder)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		H7G5FolderServiceHttp.class);

	private static final Class<?>[] _addMyCustomH7G5FolderParameterTypes0 =
		new Class[] {String.class, String.class};
	private static final Class<?>[]
		_addMyCustomH7G5FolderWithPermissionCheckParameterTypes1 = new Class[] {
			String.class, String.class
		};

}