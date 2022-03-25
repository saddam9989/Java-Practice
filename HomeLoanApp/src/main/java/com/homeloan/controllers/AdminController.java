package com.homeloan.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.entities.Admin;
import com.homeloan.entities.Customer;
import com.homeloan.entities.FinanceVerificationOfficer;
import com.homeloan.entities.LandVerificationOfficer;
import com.homeloan.entities.LoanAgreement;
import com.homeloan.entities.LoanApplication;
import com.homeloan.entities.ResponseToken;
import com.homeloan.entities.User;
import com.homeloan.exceptions.AdminApprovalException;
import com.homeloan.exceptions.CustomerNotFoundException;
import com.homeloan.exceptions.LoanAgreementNotFoundException;
import com.homeloan.exceptions.LoanApplicationNotFoundException;
import com.homeloan.jwt.JwtTokenUtil;
import com.homeloan.repositories.IAdminRepository;
import com.homeloan.services.CustomerService;
import com.homeloan.services.IAdminService;
import com.homeloan.services.IFinanceVerificationService;
import com.homeloan.services.ILandVerificationService;
import com.homeloan.services.ILoanApplicationService;
import com.homeloan.services.LoanAgreementService;

@RestController
@RequestMapping("/homeloan/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	Logger logger = Logger.getLogger(AdminController.class.getName());	

	@Autowired
	IAdminService adminService;
	
	@Autowired
	private IAdminRepository iAdminRepository;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	IFinanceVerificationService financeVerificationService;
	
	@Autowired
	ILandVerificationService landVerificationService;
	
	@Autowired
	ILoanApplicationService loanApplicationService;
	
	@Autowired
	LoanAgreementService loanAgreementService;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	User user =null;
	
	
	
	public AdminController() {
		logger.log(Level.INFO,"-----> Inside Admin Service Controller Working!");
	}
	
	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin,HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		
		return new ResponseEntity<>(adminService.addAdmin(admin), HttpStatus.OK);
	}
	

	@PostMapping("/addFinanceOfficer")
	public ResponseEntity<FinanceVerificationOfficer> addFinanceOfficer(@RequestBody FinanceVerificationOfficer officer,HttpServletRequest request) {
	    user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(financeVerificationService.addFinanceOfficer(officer), HttpStatus.OK);
	}
	
	@PostMapping("/addLandOfficer")
	public ResponseEntity<LandVerificationOfficer> addLandOfficer(@RequestBody LandVerificationOfficer officer,HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(landVerificationService.addLandOfficer(officer),HttpStatus.OK);
	}	
	
	@GetMapping("/{userId}")
	public ResponseEntity<Admin> viewAdmin(@PathVariable("userId") int userId,HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(adminService.getAdmin(userId), HttpStatus.OK);
	}
	
	@GetMapping("landOfficer/{userId}")
	public ResponseEntity<LandVerificationOfficer> viewLandOfficer(@PathVariable("userId") int userId,HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(landVerificationService.getLandOfficer(userId), HttpStatus.OK);
	}
	
	@GetMapping("financeOfficer/{userId}")
	public ResponseEntity<FinanceVerificationOfficer> viewFinanceOfficer(@PathVariable("userId") int userId,HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(financeVerificationService.getFinanceOfficer(userId), HttpStatus.OK);
	}
	
	@GetMapping("/Admins")
	public ResponseEntity<List<Admin>> viewAllAdmin(HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(adminService.getAllAdmin(), HttpStatus.OK);
		
	}
	
	
	@GetMapping("/FinanceOfficers")
	public ResponseEntity<List<FinanceVerificationOfficer>> viewAllFinanceOfficer(HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(financeVerificationService.getAllFinanceOfficers(), HttpStatus.OK);
		
	}
	
	
	@GetMapping("/LandOfficers")
	public ResponseEntity<List<LandVerificationOfficer>> viewAllLandOfficer(HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(landVerificationService.getAllLandOfficers(), HttpStatus.OK);
		
	}

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> viewAllCustomers(HttpServletRequest request){
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
	}
	
	@GetMapping("/LoanApplications")
	public ResponseEntity<List<LoanApplication>> getAllLoanApplications(HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanApplicationService.retrieveAllLoanApplication(), HttpStatus.OK);
	}
	
	@GetMapping("/LoanAgreements")
	public ResponseEntity<List<LoanAgreement>> getAllAgreementList(HttpServletRequest request) {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanAgreementService.getAllLoanAgreements(), HttpStatus.OK);
	}
	
	@PutMapping("/updateAdminVerificationStatus/{loanApplicationId}")
	public ResponseEntity<LoanApplication> updateAdminStatus(@PathVariable int loanApplicationId,HttpServletRequest request) throws AdminApprovalException, LoanApplicationNotFoundException {
	user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanApplicationService.updateAdminStatus(loanApplicationId), HttpStatus.OK);

	}
	
	@PutMapping("/updateLoanApplication")
	public ResponseEntity<LoanApplication> updateLoanApplication(@PathVariable int loanApplicationId, @RequestBody LoanApplication loanApplication,HttpServletRequest request) throws LoanApplicationNotFoundException {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanApplicationService.updateLoanApplication(loanApplicationId,loanApplication), HttpStatus.OK);
	}
	
	@PutMapping("/updateLoanAgreement")
	public ResponseEntity<LoanAgreement> updateLoanAgreement(@PathVariable int loanAgreementId,@RequestBody LoanAgreement loanAgreement,HttpServletRequest request) throws LoanAgreementNotFoundException {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanAgreementService.updateLoanAgreement(loanAgreementId, loanAgreement), HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/deleteLoanApplication/{loanApplicationId}")
	public ResponseEntity<LoanApplication> deleteLoanApplication(@PathVariable int loanApplicationId,HttpServletRequest request) throws LoanApplicationNotFoundException {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanApplicationService.deleteLoanApplication(loanApplicationId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteLoanAgreement/{loanAgreementId}")
	public ResponseEntity<LoanAgreement> deleteLoanAgreement(@PathVariable int loanAgreementId,HttpServletRequest request) throws LoanAgreementNotFoundException {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity<>(loanAgreementService.deleteLoanAgreement(loanAgreementId), HttpStatus.OK);
	}
	
}