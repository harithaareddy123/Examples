package com.deloitte.ecommerce.dao;

import java.util.HashMap;
import java.util.Map;

import com.deloitte.ecommerce.entity.AppUser;



public class DaoImpl implements Dao {
	private Map<String, AppUser> store = new HashMap<>();
	public DaoImpl() {
       AppUser user1 = new AppUser("6754","1234", "haritha",212);
        store.put("6754", user1);
        AppUser user2 = new AppUser("6787","1345","ram",215);
        store.put("6787", user2);
    }

	@Override
	public AppUser getUserByMobile(String Mobile) {
		 AppUser user = store.get(Mobile);
	        return user;
	    }
	     
	@Override
	public boolean credentialsCorrect(String Mobile, String password) {
		
	 AppUser user = store.get(Mobile);
     if (user == null) {
         return false;
     }
     return user.getPassword().equals(password);
 }

	
	}


