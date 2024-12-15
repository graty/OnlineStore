package ro.digitalnation.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
    private CustomerRepository customerRepository;
	
	public List<Users> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Users saveCustomer(Users user) {
        return customerRepository.save(user);
    }
    
    public Customer findByUsername (String username) {
    	return customerRepository.findByUsername(username);
    }
    
    
    
}
