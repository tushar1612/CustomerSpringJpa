package com.cg.customer.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customer.entities.Customer;
import com.cg.customer.service.ICustomerService;


@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service;
	public void run()
	{
		Customer customer = add("tushar");
		Customer customer1 = add("gaurav");
		Customer customer2= add("Jatin");
		Long id1 = customer.getId();
		System.out.println("Name Before update: "+customer.toString());
		customer = update(id1, "tanmay");
		System.out.println("Name After update: "+customer.toString());
		System.out.println("Name Before update: "+customer1.toString());
		Long id2 = customer1.getId();
		customer1 = update(id2, "ramesh");
		System.out.println("Name After update: "+customer1.toString());
		System.out.println(customer2.toString());
	}
	
	public Customer add(String name)
	{
		Customer customer = new Customer(name);
		customer = service.register(customer);
		return customer;
	}
	
	public Customer update(Long id, String newName)
	{
		return service.updateName(id, newName);
	}
	
}
