package io.github.senhw.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.senhw.crm.dao.CustomerDAO;
import io.github.senhw.crm.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	// delegate calls to dao
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

}
