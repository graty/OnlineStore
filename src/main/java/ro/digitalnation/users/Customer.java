package ro.digitalnation.users;

import jakarta.persistence.Entity;

@Entity
public class Customer extends Users{
	
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String username) {
		super(firstName, lastName, username);
	}

  
} 
