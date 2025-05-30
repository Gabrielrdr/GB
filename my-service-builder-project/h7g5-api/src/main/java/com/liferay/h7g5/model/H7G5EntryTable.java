/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;OHQIWTSFHL_H7G5Entry&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5Entry
 * @generated
 */
public class H7G5EntryTable extends BaseTable<H7G5EntryTable> {

	public static final H7G5EntryTable INSTANCE = new H7G5EntryTable();

	public final Column<H7G5EntryTable, Long> h7g5EntryId = createColumn(
		"h7g5EntryId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<H7G5EntryTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, Long> h7g5FolderId = createColumn(
		"h7g5FolderId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, String> key = createColumn(
		"key_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<H7G5EntryTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private H7G5EntryTable() {
		super("OHQIWTSFHL_H7G5Entry", H7G5EntryTable::new);
	}

}