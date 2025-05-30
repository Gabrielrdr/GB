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
 * The table class for the &quot;OHQIWTSFHL_H7G5Folder&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5Folder
 * @generated
 */
public class H7G5FolderTable extends BaseTable<H7G5FolderTable> {

	public static final H7G5FolderTable INSTANCE = new H7G5FolderTable();

	public final Column<H7G5FolderTable, Long> h7g5FolderId = createColumn(
		"h7g5FolderId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<H7G5FolderTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<H7G5FolderTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<H7G5FolderTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<H7G5FolderTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<H7G5FolderTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<H7G5FolderTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<H7G5FolderTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<H7G5FolderTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private H7G5FolderTable() {
		super("OHQIWTSFHL_H7G5Folder", H7G5FolderTable::new);
	}

}