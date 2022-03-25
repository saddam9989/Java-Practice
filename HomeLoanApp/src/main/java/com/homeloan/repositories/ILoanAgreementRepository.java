package com.homeloan.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.homeloan.entities.LoanAgreement;

public interface ILoanAgreementRepository extends JpaRepository<LoanAgreement, Integer> {
	@Query(value = "SELECT loan_agreement_id FROM loan_agreement loan_agreement_id WHERE loan_agreement_id.loan_application_id=:loanApplicationId",nativeQuery = true)
	public int findByLoanApplicationId(@Param("loanApplicationId")int loanApplicationId);
	
	
}
