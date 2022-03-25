package com.homeloan.controllers;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.entities.Customer;
import com.homeloan.entities.LoanAgreement;
import com.homeloan.entities.LoanApplication;
import com.homeloan.entities.ResponseToken;
import com.homeloan.entities.Status;
import com.homeloan.entities.User;
import com.homeloan.exceptions.CustomerNotFoundException;
import com.homeloan.exceptions.LoanAgreementNotFoundException;
import com.homeloan.exceptions.LoanApplicationNotFoundException;
import com.homeloan.jwt.JwtTokenUtil;
import com.homeloan.repositories.ICustomerRepository;
import com.homeloan.services.CustomerService;
import com.homeloan.services.IEmiService;
import com.homeloan.services.ILoanAgreementService;
import com.homeloan.services.ILoanApplicationService;

@RestController
@RequestMapping("/homeloan/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	Logger logger = Logger.getLogger(AdminController.class.getName());
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ICustomerRepository iCustomerRepository;
	
	@Autowired
	ILoanApplicationService loanapplicationservice;
	
	@Autowired
	IEmiService emiService;
	@Autowired
	ILoanAgreementService loanAgreementservice;
	
	boolean isLoggedIn = false;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	User user =null;
	
	
	
	public CustomerController() {
		logger.log(Level.INFO,"-----> Inside Customer Service Controller Working!");
	}
		
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		//user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		
		return new ResponseEntity<>(customerService.addCustomer(customer),HttpStatus.OK);
	}
	
	@GetMapping("/getCustomer/{userId}")
	public ResponseEntity<Customer> viewCustomer(@PathVariable int userId,HttpServletRequest request) throws CustomerNotFoundException {
	   user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		
		return new ResponseEntity<>(customerService.getCustomer(userId),HttpStatus.OK);
	}
	
	@GetMapping("/getUserId/{username}")
	public ResponseEntity<Integer> getUserId(@PathVariable String username) throws CustomerNotFoundException {
		return new ResponseEntity<>(customerService.getUserIdByUsername(username),HttpStatus.OK);
	}
	
	
	
	@PutMapping("/updateCustomer/{userId}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int userId, @RequestBody Customer customer,HttpServletRequest request) throws CustomerNotFoundException {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		
		return new ResponseEntity<>(customerService.updateCustomer(userId,customer),HttpStatus.OK);
	}
	
	@PostMapping("/applyLoan/{userId}/{loanAppliedAmount}/{loanTenureYears}")
	public ResponseEntity<LoanApplication> applyLoan(@PathVariable int userId, @PathVariable double loanAppliedAmount, @PathVariable int loanTenureYears,HttpServletRequest request) throws CustomerNotFoundException {
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		
		return new ResponseEntity<>(loanapplicationservice.addLoanApplication(userId,loanAppliedAmount,loanTenureYears), HttpStatus.OK);
	}
	
	@GetMapping("/loanTracker/{loanApplicationId}")
	public ResponseEntity<Status> loanTracker(@PathVariable int loanApplicationId,HttpServletRequest request) throws LoanApplicationNotFoundException{
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		
		return new ResponseEntity<>(loanapplicationservice.retrieveLoanApplication(loanApplicationId).getStatus(),HttpStatus.OK);
	}
	
	@GetMapping("/loanAgreement/{loanApplicationId}")
	public ResponseEntity<LoanAgreement> getLoanAgreement(@PathVariable int loanApplicationId,HttpServletRequest request) throws LoanAgreementNotFoundException{
		user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		
		return new ResponseEntity<>(loanapplicationservice.getLoanAgreement(loanApplicationId),HttpStatus.OK);
	}
	@GetMapping("/EMICalculator/{principal}/{intrestRate}/{tenure}")
	public ResponseEntity<?> emiCalculator(@PathVariable double principal,@PathVariable double intrestRate,@PathVariable int tenure){
		return new ResponseEntity<>(emiService.calculateEmi(principal, intrestRate, tenure),HttpStatus.OK);
	}
	
	@GetMapping("/loanAgreementId/{loanApplicationId}")
	public ResponseEntity<?> getLoanAgreementId(@PathVariable int loanApplicationId) throws LoanAgreementNotFoundException{
		//user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return new ResponseEntity <>(loanAgreementservice.getLoanAgreementId(loanApplicationId),HttpStatus.OK);
		//return new ResponseEntity<>(loanAgreementservice.getLoanAgreement(loanApplicationId),HttpStatus.OK);
	}
	
	@GetMapping("/loanAgreement/{loanAgreementId}")
	public LoanAgreement getLoanAgreement(@PathVariable int loanAgreementId) throws LoanAgreementNotFoundException{
		//user=jwtTokenUtil.validateTokenAndGetUserDetails(request);
		return loanAgreementservice.getLoanAgreement(loanAgreementId);
		//return new ResponseEntity<>(loanAgreementservice.getLoanAgreement(loanApplicationId),HttpStatus.OK);
	}
}
