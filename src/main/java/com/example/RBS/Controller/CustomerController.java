package com.example.RBS.Controller;

import  java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import com.example.RBS.Entity.Loan;
import com.example.RBS.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.RBS.Entity.Customer;
import com.example.RBS.Repository.CustomerRepository;

@RestController
@CrossOrigin(origins="http://localhost:58395")
public class CustomerController {

	@Autowired
	LoanRepository loanRepo;
	@Autowired
	CustomerRepository customerRepository;

	static String custname;

	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {

		custname = customer.customerName;
		return new ResponseEntity<>(this.customerRepository.save(customer), HttpStatus.OK);

	}

	@PostMapping("/addLoanInfo")
	public ResponseEntity<Loan> addLoanInfo(@RequestBody Loan loan) {
//		@Query("Select c from Customer c where c.customerName = ?1")
		List<Customer> listcustomer = customerRepository.findAll();
		for (Customer c : listcustomer) {
			String cname = c.customerName;
			if (cname.equals(custname)) {
//				loan.customer = c;
			}
		}
		return new ResponseEntity<>(this.loanRepo.save(loan), HttpStatus.OK);

	}


//	@GetMapping("/getCustomer")
//	public List<Loan> getCustomers() {
//
//		Customer customer = new Customer();
//		customer.customerId = 1;
//		customer.customerName = "Vamsi";
//		customer.address = "Hyderabad";
//		customer.pan = "ABCD123";
//
//		Loan loan1 = new Loan();
//		loan1.loanId = 1;
//		loan1.loanAmount = 100000;
//		loan1.loanType = "Education";
//		loan1.customer=customer;
//
//
//		Loan loan2 = new Loan();
//		loan2.loanId = 2;
//		loan2.loanAmount = 200000;
//		loan2.loanType = "Agriculture";
//		loan2.customer=customer;
//
//
//
//		List<Loan> list = new ArrayList<>();
//
//		list.add(loan1);
//		list.add(loan2);
//
//		return loanRepo.saveAll(list);
//	}

	@GetMapping("/customerDetails")
	public List<Customer> getCustomerDetails() {
		return customerRepository.findAll();
	}

	@GetMapping("/loanDetails")
	public List<Loan> getLoanDetails() {
		return loanRepo.findAll();
	}


	//"fetching customer details"
//		if (cust.isPresent()) {

//		return cust.get();


	@GetMapping("/loandetails/{id}")
	public Loan getLoanDetails(@PathVariable int id) {
		return loanRepo.findById(id).get();

	}
}


