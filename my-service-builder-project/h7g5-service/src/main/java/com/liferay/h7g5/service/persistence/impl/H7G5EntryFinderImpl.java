package com.liferay.h7g5.service.persistence.impl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.H7G5EntryLocalServiceUtil;
import com.liferay.h7g5.service.persistence.H7G5EntryFinder;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;


@Component(service = H7G5EntryFinder.class)

public class H7G5EntryFinderImpl extends H7G5EntryFinderBaseImpl implements H7G5EntryFinder {

    public List<H7G5Entry> findByH7G5EntryFolderId(long folderId) {

        Session session = null;
        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                    .add(RestrictionsFactoryUtil.eq("h7g5FolderId", folderId));

            List<H7G5Entry> entries = H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);

            return entries;
        } catch (Exception e) {
            try {
                throw new SystemException(e);
            } catch (SystemException se) {
                se.printStackTrace();
            }
        } finally {
            closeSession(session);
        }

        return null;
    }

    public H7G5Entry findByKey(String key) {

        Session session = null;
        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                    .add(RestrictionsFactoryUtil.eq("key", key));

            List<H7G5Entry> entries = H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);


            return entries.get(0);
        } catch (Exception e) {
            try {
                throw new SystemException(e);
            } catch (SystemException se) {
                se.printStackTrace();
            }
        } finally {
            closeSession(session);
        }
        return null;
    }

    public List<H7G5Entry> findByName(String name) {

        Session session = null;
        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                    .add(RestrictionsFactoryUtil.eq("name", name));

            List<H7G5Entry> entries = H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);


            return entries;
        } catch (Exception e) {
            try {
                throw new SystemException(e);
            } catch (SystemException se) {
                se.printStackTrace();
            }
        } finally {
            closeSession(session);
        }
        return null;
    }

    public H7G5Entry findByHDN(long folderId, String description, String name) {

        Session session = null;
        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                    .add(RestrictionsFactoryUtil.eq("h7g5FolderId", folderId))
                    .add(RestrictionsFactoryUtil.eq("description", description))
                    .add(RestrictionsFactoryUtil.eq("name", name));

            List<H7G5Entry> entries = H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);


            return entries.get(0);
        } catch (Exception e) {
            try {
                throw new SystemException(e);
            } catch (SystemException se) {
                se.printStackTrace();
            }
        } finally {
            closeSession(session);
        }
        return null;
    }
}


