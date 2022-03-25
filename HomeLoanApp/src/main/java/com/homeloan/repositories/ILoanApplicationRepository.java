package com.homeloan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeloan.entities.LoanApplication;

public interface ILoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {
	
}
