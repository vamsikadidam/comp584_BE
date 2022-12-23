package com.example.RBS;


//import java.time.LocalDate;
//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.RBS.Entity.Customer;
import com.example.RBS.Repository.CustomerRepository;

@SpringBootApplication
public class RbsApplication 
//implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(RbsApplication.class, args);

	}

//		@Autowired
//		private CustomerRepository customerRepository;
//		
//		@Override
//		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
//			Date date=Date.of(2000, 10, 10)
			
//			this.customerRepository.save(new Customer("12345", "VK", "address", "ABCDE1234F", "String@1"));
//					Customer("12345","Vk","address","2000-10-10","ABCDE1234F","String@1")
//					this.customerRepository.save(new Customer("12346", "VK2", "address", "ABCDE1234G", "String@1"));
//					this.customerRepository.save(new Customer("12347", "VK3", "address", "ABCDE1234H", "String@1"));
//
//	}

}
