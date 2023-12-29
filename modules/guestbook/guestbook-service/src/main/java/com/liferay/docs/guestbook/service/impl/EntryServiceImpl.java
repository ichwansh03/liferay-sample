/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.docs.guestbook.service.impl;

import com.liferay.docs.guestbook.service.base.EntryServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author liferay
 */
@Component(
	property = {
		"json.web.service.context.name=gb",
		"json.web.service.context.path=Entry"
	},
	service = AopService.class
)
public class EntryServiceImpl extends EntryServiceBaseImpl {
}