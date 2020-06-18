package it.dst.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dst.model.Product;
import it.dst.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public ModelAndView homepage() {
		List<Product> listProduct = productService.listAll();
		ModelAndView model = new ModelAndView("homepage");
		model.addObject("listProduct", listProduct);
		return model;
	}
	@RequestMapping("/new")
	public String newProductForm(Map<String, Object> model) {
		Product product = new Product();
		model.put("product", product);
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editProductForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = productService.get(id);
		mav.addObject("product", product);
		
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteProductForm(@RequestParam long id) {
		productService.delete(id);
		return "redirect:/";		
	}
	
	
}
