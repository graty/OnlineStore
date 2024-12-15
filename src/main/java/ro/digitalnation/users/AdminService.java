package ro.digitalnation.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
    private AdminRepository adminRepository;
	
	public List<Users> getAllUsers() {
        return adminRepository.findAll();
    }
   
    public Users saveAdministrator(Users user) {
        return adminRepository.save(user);
    }
    
    public Administrator findByUsername (String username) {
    	return adminRepository.findByUsername(username);
    }
}
