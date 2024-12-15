package ro.digitalnation.users;

import jakarta.persistence.Entity;

@Entity
public class Administrator extends Users {

	public Administrator() {
		super();
	}

	public Administrator(String firstName, String lastName, String username) {
		super(firstName, lastName, username);
	}
	
	
}
