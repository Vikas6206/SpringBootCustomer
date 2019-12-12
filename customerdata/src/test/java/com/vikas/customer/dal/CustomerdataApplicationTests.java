package com.vikas.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vikas.customer.dal.entities.Customer;
import com.vikas.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	void createCustomer() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Vikas");
		customer.setEmail("Vikas.kr6206@gmail.com");
		
		customerRepository.save(customer);
		
	}
	
	
	@Test
	void updateCustomer() {
		Customer customer = customerRepository.findById(1).get();
		customer.setEmail("Vikas.kumar6206@gmail.com");
		
		customerRepository.save(customer);
	}
	
	@Test
	void getCustomerDetails() {
		System.out.println(customerRepository.findById(1).get());
	}

	
	@Test
	void deleteCustomerDetails() {
		customerRepository.deleteById(1);
	}
	
}
