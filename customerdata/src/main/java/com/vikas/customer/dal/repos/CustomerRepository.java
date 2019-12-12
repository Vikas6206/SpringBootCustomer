package com.vikas.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.vikas.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
