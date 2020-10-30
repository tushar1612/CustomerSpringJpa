package com.cg.customer.service;

import com.cg.customer.entities.Customer;

public interface ICustomerService {
	public Customer register(Customer customer);
	public Customer updateName(Long id, String name);
}
