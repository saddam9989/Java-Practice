package com.homeloan.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.entities.LoanApplication;
import com.homeloan.entities.ResponseToken;
import com.homeloan.entities.User;
import com.homeloan.exceptions.LandVerificationException;
import com.homeloan.exceptions.LoanApplicationNotFoundException;
import com.homeloan.jwt.JwtTokenUtil;
import com.homeloan.repositories.ILandVerificationRepository;
import com.homeloan.services.ILoanApplicationService;
import com.homeloan.services.LandVerificationService;

@RestController
@RequestMapping("/homeloan/landOfficer")
@CrossOrigin(origins = "http://localhost:4200")
public class LandVerificationOfficerController {
	
	Logger logger = Logger.getLogger(AdminController.class.getName());

	@Autowired
	LandVerificationService landVerificationService;
	
	@Autowired
	ILoanApplicationService loanApplicationService;
	
	@Autowired
	ILandVerificationRepository iLandVerificationRepository;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	User user =null;
	
	public LandVerificationOfficerController() {
		logger.log(Level.INFO,"-----> Inside Land Service Controller Working!");
	}


	@GetMapping("/LoanApplications")
	public ResponseEntity<List<LoanApplication>> getAllLoanApplications(HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanApplicationService.retrieveAllLoanApplication(), HttpStatus.OK);
	}
	
	@PutMapping("/updateLandVerificationStatus/{loanApplicationId}")
	public ResponseEntity<LoanApplication> updateLandStatus(@PathVariable int loanApplicationId,HttpServletRequest request) throws LandVerificationException, LoanApplicationNotFoundException {
		
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanApplicationService.updateLandStatus(loanApplicationId), HttpStatus.OK);

	}
}
