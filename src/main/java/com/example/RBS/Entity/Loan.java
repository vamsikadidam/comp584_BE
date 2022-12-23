package com.example.RBS.Entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int loanId;

    public String loanType;

    public double loanAmount;
    
    @ManyToOne(cascade = {CascadeType.ALL})
    @NotFound(action = NotFoundAction.IGNORE)
    public Customer customer;
}
