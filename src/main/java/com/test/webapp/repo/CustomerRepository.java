package com.test.webapp.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.test.webapp.dao.Customer;

@Repository
@Component
public interface CustomerRepository extends MongoRepository<Customer,String> {

	public Customer findByFirstName(String firstName) ;
	public List<Customer> findByLastName(String lastName) ;

}
