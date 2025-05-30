/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

 package com.liferay.h7g5.service.impl;

 import com.liferay.h7g5.model.H7G5Entry;
 import com.liferay.h7g5.service.base.H7G5EntryLocalServiceBaseImpl;
 import com.liferay.portal.aop.AopService;


 import org.osgi.service.component.annotations.Component;
 
 import java.util.List;
 
 /**
  * 
  * @author Brian Wing Shun Chan
  * 
  */
 
 @Component(property = "model.class.name=com.liferay.h7g5.model.H7G5Entry", service = AopService.class)
 
 public class H7G5EntryLocalServiceImpl extends H7G5EntryLocalServiceBaseImpl {

     public List<H7G5Entry> findH7G5EntriesByFolderIdWithDynamic(long folderId) {
         System.out.println("Searching entries with folderId = " + folderId);
         return h7g5EntryFinder.findByH7G5EntryFolderId(folderId);
     }

     public H7G5Entry findH7G5EntriesByKeyWithDynamic(String key) {
         System.out.println("Searching entries with key = " + key);
         return h7g5EntryFinder.findByKey(key);
     }

     public List<H7G5Entry> findH7G5EntriesByNameWithDynamic(String name) {
         System.out.println("Searching entries with name = " + name);
         return h7g5EntryFinder.findByName(name);
     }

     public H7G5Entry findH7G5EntriesByHDNWithDynamic(long folderId, String description, String name) {
         System.out.println("Searching with folderId = " + folderId + ", description = " + description + " and name = " + name);
         return h7g5EntryFinder.findByHDN(folderId, description, name);
     }
 }

     /*
    @Override
   public List<H7G5Entry> findByH7G5FolderId(long folderId) {
        return h7g5EntryPersistence.findByH7G5FolderId(folderId);
    }
    
    @Override
    public H7G5Entry findEntryByKey(String key) throws NoSuchH7G5EntryException {
        return findH7G5ByKey(key);
    }
    
    @Override
    public List<H7G5Entry> findEntryByName(String name) {
        return findH7G5ByName(name);
    }
    
    @Override
    public H7G5Entry findEntryByH_D_N(long folderId, String description, String name)
            throws NoSuchH7G5EntryException {
        return findH7G5ByHDN(folderId, description, name);
    }
}

      */