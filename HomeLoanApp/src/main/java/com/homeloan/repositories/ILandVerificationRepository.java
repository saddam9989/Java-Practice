package com.homeloan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeloan.entities.LandVerificationOfficer;

public interface ILandVerificationRepository extends JpaRepository<LandVerificationOfficer, Integer> {

	
}


