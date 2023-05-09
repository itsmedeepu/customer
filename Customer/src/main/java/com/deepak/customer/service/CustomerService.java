package com.deepak.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.customer.entity.Customer;
import com.deepak.customer.repository.CustomerDao;
import com.deepak.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer saveuser(Customer customer) {

		return customerDao.saveCustomer(customer);

	}

	public List<Customer> getallcustomer() {

		return customerDao.getallcustomer();

	}

	public Customer updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}
	
	public void deleteCustomer(int id) {
		customerDao.deleteCustomerById(id);
	}
	
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

}
