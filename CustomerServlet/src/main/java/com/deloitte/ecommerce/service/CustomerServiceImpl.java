package com.deloitte.ecommerce.service;

import com.deloitte.ecommerce.entity.AppUser;

public class CustomerServiceImpl implements CustomerService {
	CustomerServiceImpl dao;
	@Override
	public AppUser getUserByMobile(String Mobile) {
		AppUser user = dao.getUserByMobile(Mobile);
        return user;
	}
	public boolean credentialsCorrect(String mobile, String password) {
		 
		boolean correct = dao.credentialsCorrect(mobile, password);
	        return correct;
	    }
	
	}
	
	
     
	


