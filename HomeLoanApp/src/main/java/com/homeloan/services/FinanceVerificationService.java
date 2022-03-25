package com.homeloan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.entities.FinanceVerificationOfficer;
import com.homeloan.repositories.IFinanceVerificationRepository;

@Service
public class FinanceVerificationService implements IFinanceVerificationService {

	@Autowired
	IFinanceVerificationRepository iFinanceVerificationRepository;
	
	// saving a specific record by using the method save() of CrudRepository
	public FinanceVerificationOfficer addFinanceOfficer(FinanceVerificationOfficer officer) {
		iFinanceVerificationRepository.save(officer);
		return officer;
	}

	@Override
	public FinanceVerificationOfficer getFinanceOfficer(int userId) {
	    return iFinanceVerificationRepository.findById(userId).get();
		
	}

	@Override
	public List<FinanceVerificationOfficer> getAllFinanceOfficers() {
		
		return iFinanceVerificationRepository.findAll();
	}
	
}