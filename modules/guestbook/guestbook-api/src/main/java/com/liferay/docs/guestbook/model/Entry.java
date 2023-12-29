/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.docs.guestbook.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Entry service. Represents a row in the &quot;GB_Entry&quot; database table, with each column mapped to a property of this class.
 *
 * @author liferay
 * @see EntryModel
 * @generated
 */
@ImplementationClassName("com.liferay.docs.guestbook.model.impl.EntryImpl")
@ProviderType
public interface Entry extends EntryModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.docs.guestbook.model.impl.EntryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Entry, Long> ENTRY_ID_ACCESSOR =
		new Accessor<Entry, Long>() {

			@Override
			public Long get(Entry entry) {
				return entry.getEntryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Entry> getTypeClass() {
				return Entry.class;
			}

		};

}