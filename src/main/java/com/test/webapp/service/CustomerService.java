package com.test.webapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.webapp.dao.Customer;
import com.test.webapp.repo.CustomerRepository;

@Component
@Path("/customerService")
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String testapp(){
		Customer customer = new Customer("sai","kumar");
		customer=customerRepository.save(customer);
		return customer.toString();
	}
}
