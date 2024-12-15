package ro.digitalnation.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
    public String index() {		
        return "index";
    }
	
	@GetMapping("/customerRegistration")
    public String customerPage(Model model) {
		model.addAttribute("customer", new Customer());
        return "customerRegistration";
    }
	
	@GetMapping("/adminRegistration")
    public String indexPage(Model model) {
		model.addAttribute("administrator", new Administrator());
        return "adminRegistration";
    }
}
