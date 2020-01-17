package com.deloitte.ecommerce.service;

import com.deloitte.ecommerce.entity.AppUser;

public interface CustomerService {
	 AppUser getUserByMobile(String Mobile);

	    boolean credentialsCorrect(String Mobile, String password);
	}


