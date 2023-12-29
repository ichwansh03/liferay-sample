/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.docs.guestbook.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Guestbook}.
 * </p>
 *
 * @author liferay
 * @see Guestbook
 * @generated
 */
public class GuestbookWrapper
	extends BaseModelWrapper<Guestbook>
	implements Guestbook, ModelWrapper<Guestbook> {

	public GuestbookWrapper(Guestbook guestbook) {
		super(guestbook);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("guestbookId", getGuestbookId());
		attributes.put("groupId", getGroupId());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	 * Returns the group ID of this guestbook.
	 *
	 * @return the group ID of this guestbook
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the guestbook ID of this guestbook.
	 *
	 * @return the guestbook ID of this guestbook
	 */
	@Override
	public long getGuestbookId() {
		return model.getGuestbookId();
	}

	/**
	 * Returns the name of this guestbook.
	 *
	 * @return the name of this guestbook
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this guestbook.
	 *
	 * @return the primary key of this guestbook
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this guestbook.
	 *
	 * @return the status of this guestbook
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this guestbook.
	 *
	 * @return the status by user ID of this guestbook
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this guestbook.
	 *
	 * @return the status by user name of this guestbook
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this guestbook.
	 *
	 * @return the status by user uuid of this guestbook
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this guestbook.
	 *
	 * @return the status date of this guestbook
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the uuid of this guestbook.
	 *
	 * @return the uuid of this guestbook
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this guestbook is approved.
	 *
	 * @return <code>true</code> if this guestbook is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this guestbook is denied.
	 *
	 * @return <code>true</code> if this guestbook is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this guestbook is a draft.
	 *
	 * @return <code>true</code> if this guestbook is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this guestbook is expired.
	 *
	 * @return <code>true</code> if this guestbook is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this guestbook is inactive.
	 *
	 * @return <code>true</code> if this guestbook is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this guestbook is incomplete.
	 *
	 * @return <code>true</code> if this guestbook is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this guestbook is pending.
	 *
	 * @return <code>true</code> if this guestbook is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this guestbook is scheduled.
	 *
	 * @return <code>true</code> if this guestbook is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the group ID of this guestbook.
	 *
	 * @param groupId the group ID of this guestbook
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the guestbook ID of this guestbook.
	 *
	 * @param guestbookId the guestbook ID of this guestbook
	 */
	@Override
	public void setGuestbookId(long guestbookId) {
		model.setGuestbookId(guestbookId);
	}

	/**
	 * Sets the name of this guestbook.
	 *
	 * @param name the name of this guestbook
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this guestbook.
	 *
	 * @param primaryKey the primary key of this guestbook
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this guestbook.
	 *
	 * @param status the status of this guestbook
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this guestbook.
	 *
	 * @param statusByUserId the status by user ID of this guestbook
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this guestbook.
	 *
	 * @param statusByUserName the status by user name of this guestbook
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this guestbook.
	 *
	 * @param statusByUserUuid the status by user uuid of this guestbook
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this guestbook.
	 *
	 * @param statusDate the status date of this guestbook
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the uuid of this guestbook.
	 *
	 * @param uuid the uuid of this guestbook
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected GuestbookWrapper wrap(Guestbook guestbook) {
		return new GuestbookWrapper(guestbook);
	}

}