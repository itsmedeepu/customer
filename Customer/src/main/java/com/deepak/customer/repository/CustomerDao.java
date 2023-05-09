package com.deepak.customer.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.deepak.customer.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {

		return customerRepository.save(customer);

	}

	public List<Customer> getallcustomer() {
		return customerRepository.findAll();
	}

	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public void deleteCustomerById(Integer id) {
		customerRepository.deleteById(id);
	}

	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).orElse(
				new Customer(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.name(), HttpStatus.NOT_FOUND.name()));
	}

}
