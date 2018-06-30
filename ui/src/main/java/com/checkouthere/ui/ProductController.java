/**
 * 
 */
package com.checkouthere.ui;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author manasamahesh
 *
 */
@Controller
public class ProductController {
	@GetMapping("/products")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/getAllProducts", Product.class);
        model.addAttribute("product", product);
        return "products";
    }
}
