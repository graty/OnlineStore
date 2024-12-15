package ro.digitalnation.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	@Autowired
    private ProductService productService;
	
    @GetMapping("/products")
    public String showProducts(Model model) {
	List<Product> products = productService.getAllProducts();       
    model.addAttribute("products", products);
        return "listProducts";
    }
   
    @PostMapping("/addProduct")
	public String addProduct(@ModelAttribute Product product, Model model) {
    	productService.saveProduct(product);
    	return "redirect:products";
	}
    
 }
