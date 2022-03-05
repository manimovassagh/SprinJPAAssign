package com.github.com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.com.entities.Address;
import com.github.com.entities.Customer;
import com.github.com.repositories.CustomerRepository;

@SpringBootTest
class CustomerAddressApplicationTests {
	@Autowired
	CustomerRepository repository;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testSaveCustomer() {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("mani");
		customer.setFamily("Movassagh");
		Address address = new Address();
		address.setCity("Mainz");
		address.setCountry("Germany");
		address.setState("RHLP");
		address.setZopcode("55120");
		address.setStreet("Rheinallee");
		customer.setAddress(address);
		repository.save(customer);
		
		
	}
	
	
	

}
