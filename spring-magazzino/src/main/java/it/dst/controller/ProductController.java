package it.dst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.dst.model.Product;
import it.dst.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public ModelAndView homepage() {
		List<Product> productList = productService.listAll();
		ModelAndView model = new ModelAndView("homepage");
		model.addObject("productList", productList);
		return model;
	}
}
