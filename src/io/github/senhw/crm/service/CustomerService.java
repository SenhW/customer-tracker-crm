package io.github.senhw.crm.service;

import java.util.List;

import io.github.senhw.crm.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
