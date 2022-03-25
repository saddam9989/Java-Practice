package com.homeloan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.entities.Customer;
import com.homeloan.exceptions.CustomerNotFoundException;
import com.homeloan.repositories.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	ICustomerRepository iCustomerRepository;
	
	
	// adding a specific record by using the method save() of CrudRepository
	@Override
	public Customer addCustomer(Customer customer) {
		iCustomerRepository.save(customer);
		return customer;
	}
	
   //	get userId by userName
	@Override
	public int getUserIdByUsername(String username) throws CustomerNotFoundException {
		int userId = iCustomerRepository.findByUsername(username).getUserId();
		return userId;
	}
	

  // getting a specific record by using the method findById() of CrudRepository
	@Override
	public Customer getCustomer(int userId) throws CustomerNotFoundException { 
		return iCustomerRepository.findById(userId).orElseThrow(()->new CustomerNotFoundException("Customer detail not found !!!"));
	}

  // it gets all the customers
	@Override
	public List<Customer> getAllCustomers(){
		return iCustomerRepository.findAll();
	}
	
	// updating a specific record by using specific userId of the customer
	@Override
	public Customer updateCustomer(int userId,Customer customer) throws CustomerNotFoundException {
		iCustomerRepository.findById(userId).orElseThrow(()->new CustomerNotFoundException("Customer detail not found !!!"));
		return iCustomerRepository.save(customer);
	}
	
	// remove a specific customer but using specific userId of the customer
	@Override
	public Customer deleteCustomer(int userId) throws CustomerNotFoundException {
		Customer customer = getCustomer(userId);
		iCustomerRepository.deleteById(userId);
		return customer;	
	}
	
	
}