/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.docs.guestbook.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.guestbook.service.http.GuestbookServiceSoap}.
 *
 * @author liferay
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class GuestbookSoap implements Serializable {

	public static GuestbookSoap toSoapModel(Guestbook model) {
		GuestbookSoap soapModel = new GuestbookSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGuestbookId(model.getGuestbookId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static GuestbookSoap[] toSoapModels(Guestbook[] models) {
		GuestbookSoap[] soapModels = new GuestbookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GuestbookSoap[][] toSoapModels(Guestbook[][] models) {
		GuestbookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GuestbookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GuestbookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GuestbookSoap[] toSoapModels(List<Guestbook> models) {
		List<GuestbookSoap> soapModels = new ArrayList<GuestbookSoap>(
			models.size());

		for (Guestbook model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GuestbookSoap[soapModels.size()]);
	}

	public GuestbookSoap() {
	}

	public long getPrimaryKey() {
		return _guestbookId;
	}

	public void setPrimaryKey(long pk) {
		setGuestbookId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getGuestbookId() {
		return _guestbookId;
	}

	public void setGuestbookId(long guestbookId) {
		_guestbookId = guestbookId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private String _uuid;
	private long _guestbookId;
	private long _groupId;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;

}