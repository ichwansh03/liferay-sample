/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.liferay.docs.guestbook.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author liferay
 */
public class EntryEmailException extends PortalException {

	public EntryEmailException() {
	}

	public EntryEmailException(String msg) {
		super(msg);
	}

	public EntryEmailException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public EntryEmailException(Throwable throwable) {
		super(throwable);
	}

}