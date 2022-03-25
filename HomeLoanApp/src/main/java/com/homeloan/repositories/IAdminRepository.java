package com.homeloan.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.homeloan.entities.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer>{
		

	
}