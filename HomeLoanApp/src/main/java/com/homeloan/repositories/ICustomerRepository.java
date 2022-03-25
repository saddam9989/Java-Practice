package com.homeloan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.homeloan.entities.Customer;
import com.homeloan.entities.User;


public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT u from User u WHERE u.username=:username ")
	public User findByUsername(@Param("username") String username);

	
}
