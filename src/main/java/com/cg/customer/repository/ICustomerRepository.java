package com.cg.customer.repository;

import com.cg.customer.entities.Customer;

public interface ICustomerRepository {
	 Customer add(Customer customer);
	 Customer update(Customer customer);
	 Customer findById(Long id);
}
