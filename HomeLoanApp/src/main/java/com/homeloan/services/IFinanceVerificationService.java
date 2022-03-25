package com.homeloan.services;

import java.util.List;

import com.homeloan.entities.Admin;
import com.homeloan.entities.FinanceVerificationOfficer;

public interface IFinanceVerificationService  {
	

	public FinanceVerificationOfficer addFinanceOfficer(FinanceVerificationOfficer officer); 
	public FinanceVerificationOfficer getFinanceOfficer(int userId);
	public List<FinanceVerificationOfficer> getAllFinanceOfficers();
	

}
