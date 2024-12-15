package ro.digitalnation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ro.digitalnation.users.Users;
import ro.digitalnation.users.AdminRepository;
import ro.digitalnation.users.Administrator;
import ro.digitalnation.users.Customer;
import ro.digitalnation.users.CustomerRepository;

@SpringBootApplication
public class OnlineStoreApplication {
	
	private static final Logger log = LoggerFactory.getLogger(OnlineStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreApplication.class, args);
	}

//	@Bean
//	  public CommandLineRunner demo(CustomerRepository repository, AdminRepository repo) {
//	    return (args) -> {  
//	      // save a few customers
//	      Users newCustomer = new Customer("Jack","Bauer");
//	      repository.save(newCustomer);
//	      
//	      newCustomer = new Customer("Chloe","O'Brian");
//	      repository.save(newCustomer);
//	      
//	      newCustomer = new Customer("Kim","Bauer");
//	      repository.save(newCustomer);
//	      
//	      newCustomer = new Customer("David","Palmer");
//	      repository.save(newCustomer);
//	      
//	      newCustomer = new Customer("Michelle","Dessler");
//	      repository.save(newCustomer);
//
//	      // fetch all customers
//	      log.info("Customers found with findAll():");
//	      log.info("-------------------------------");
//	      repository.findAll().forEach(customer -> {
//	        log.info(customer.toString());
//	      });
//	      log.info("");
//
//	      // fetch an individual customer by ID
//	      Customer customer = repository.findById(1L);
//	      log.info("Customer found with findById(1L):");
//	      log.info("--------------------------------");
//	      log.info(customer.toString());
//	      log.info("");
//
//	      // fetch customers by last name
//	      log.info("Customer found with findByLastName('Bauer'):");
//	      log.info("--------------------------------------------");
//	      repository.findByLastName("Bauer").forEach(bauer -> {
//	        log.info(bauer.toString());
//	      });
//	      log.info("");
//	      
//	      // save a few admins
//		  Users admin = new Administrator("Jack","London");
//		  repo.save(admin);
//	
//	      // fetch all administrators
//	      log.info("Admin found with findAll():");
//	      log.info("-------------------------------");
//	      repo.findAll().forEach(administrator -> {
//	        log.info(administrator.toString());
//	      });
//	      log.info("");
//
//	      // fetch an individual administrator by ID
//	      Administrator administrator = repo.findById(6L);
//	      log.info("administrator found with findById(6L):");
//	      log.info("--------------------------------");
//	      log.info(administrator.toString());
//	      log.info("");
//
//	      // fetch administrator by last name
//	      log.info("administrator found with findByLastName('London'):");
//	      log.info("--------------------------------------------");
//	      repo.findByLastName("London").forEach(london -> {
//	        log.info(london.toString());
//	      });
//	      log.info("");
//	    };
//	  }


}
