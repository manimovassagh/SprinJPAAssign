package com.github.com.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.com.entities.Customer;

public interface CustomerRepository  extends CrudRepository<Customer, Integer>{

}
