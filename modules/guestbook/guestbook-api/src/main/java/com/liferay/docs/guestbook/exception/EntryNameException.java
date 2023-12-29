/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.liferay.docs.guestbook.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author liferay
 */
public class EntryNameException extends PortalException {

	public EntryNameException() {
	}

	public EntryNameException(String msg) {
		super(msg);
	}

	public EntryNameException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public EntryNameException(Throwable throwable) {
		super(throwable);
	}

}