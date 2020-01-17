package com.deloitte.ecommerce.dao;

import com.deloitte.ecommerce.entity.AppUser;

public interface Dao {
	 AppUser getUserByMobile(String Mobile);

	    boolean credentialsCorrect(String Mobile, String password);
	}


