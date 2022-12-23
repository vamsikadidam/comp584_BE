package com.example.RBS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RBS.Entity.Customer;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
