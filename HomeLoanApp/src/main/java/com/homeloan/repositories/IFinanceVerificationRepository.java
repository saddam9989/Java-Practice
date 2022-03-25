package com.homeloan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeloan.entities.FinanceVerificationOfficer;

public interface IFinanceVerificationRepository extends JpaRepository<FinanceVerificationOfficer, Integer>{


	
}
