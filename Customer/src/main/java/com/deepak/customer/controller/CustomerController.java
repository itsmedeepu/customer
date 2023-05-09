package com.deepak.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.customer.entity.Customer;
import com.deepak.customer.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PostMapping("/saveuser")
	public @ResponseBody Customer saveuser(@RequestBody Customer customer) {

		return customerService.saveuser(customer);

	}

	@GetMapping("/getallcustomers")
	public @ResponseBody List<Customer> getallcustomers() {

		return customerService.getallcustomer();

	}

	@PutMapping("/customer")
	public @ResponseBody Customer updateCustomers(@RequestBody Customer customer) {

		return customerService.updateCustomer(customer);

	}

	@GetMapping("/getcustomer/{id}")
	public @ResponseBody Customer getCustomerByid(@PathVariable int id) {

		return customerService.getCustomerById(id);

	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody List<Customer> deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return getallcustomers();
	}

}
