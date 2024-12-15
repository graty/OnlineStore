package ro.digitalnation.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/registerAdmin")
	public String adminRegistration(@ModelAttribute Administrator administrator, Model model) {
		administrator.setUserType(administrator.getClass().getSimpleName());
		adminService.saveAdministrator(administrator);
		Administrator a = adminService.findByUsername(administrator.getUsername());
		model.addAttribute("id", a.getId());
		model.addAttribute("firstName", a.getFirstName());
		model.addAttribute("lastName", a.getLastName());
		model.addAttribute("username", a.getUsername());
		return "administratorInfo";
	}
	
	@GetMapping("/customers")
    public String showCustomers(Model model) {
		ArrayList<Users> customers = new ArrayList<Users>();
		List<Users> users = adminService.getAllUsers();
        for (Users user : users) {
			if (user.getUserType().equalsIgnoreCase("Customer")) {
				customers.add(user);
			}
		}
        model.addAttribute("customers", customers);
        return "listCustomers";
    }
	
	@GetMapping("/customer/{username}")
	public String getCustomerByUsername(@PathVariable(value="username") String customerUsername, Model model) {
		Users customer = null;
		List<Users> users = adminService.getAllUsers();
		for (Users user : users) {
			if (user.getUsername().equalsIgnoreCase(customerUsername)) {
				customer = user;				
				break;
			}
		}	
		model.addAttribute("customer", customer);
		return "customer";
	}
		
	@GetMapping("/productPage")
    public String productPage(Model model) {
		model.addAttribute("product", new Product());
        return "productPage";
    }
	
}
