package ro.digitalnation.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ProductService productService;
	
	@PostMapping("/registerCustomer")
	public String userRegistration(@ModelAttribute Customer customer, Model model) {
		customer.setUserType(customer.getClass().getSimpleName());
		customerService.saveCustomer(customer);
		Customer c = customerService.findByUsername(customer.getUsername());
		model.addAttribute("id", c.getId());
		model.addAttribute("firstName", c.getFirstName());
		model.addAttribute("lastName", c.getLastName());
		model.addAttribute("username", c.getUsername());
		return "customerInfo";
	}
		
	@GetMapping("/listProducts")
    public String showProducts(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
        return "products";
    }	
		
}
