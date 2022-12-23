package com.example.RBS.Entity;


import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;


@Entity
public class   Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int customerId;

	public String customerName;

	public String address;

	public String pan;

	@OneToMany(cascade = {CascadeType.ALL})
	@NotFound(action = NotFoundAction.IGNORE)
	public Loan loan;


}


