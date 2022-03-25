package com.homeloan.services;

import java.util.List;

import com.homeloan.entities.Admin;
import com.homeloan.entities.FinanceVerificationOfficer;
import com.homeloan.entities.LandVerificationOfficer;

public interface ILandVerificationService {
	

	public LandVerificationOfficer addLandOfficer(LandVerificationOfficer officer); 
	
	public LandVerificationOfficer getLandOfficer(int userId);
	public List<LandVerificationOfficer> getAllLandOfficers();
}


