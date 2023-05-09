package com.deepak.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	

}
