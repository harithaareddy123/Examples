package com.deloitte.telecom.mobileservice;


	import java.util.Set;

	import com.deloitte.telecom.entity.Customer;

	public interface ICustomerService {

		

		Customer findbyMobileNo(String name);

		Set<Customer> allCustomers();

		

		Customer rechargeAmount(String s, double bal, double amount);

		Customer CreateAccount(String c, String n, double a);

		void addCustomer(Customer c);

		

	}

