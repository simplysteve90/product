package it.dst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dst.model.Product;
import it.dst.repos.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepository repos;

	public void save(Product product) {
		repos.save(product);
	}

	public List<Product> listAll() {
		return (List<Product>) repos.findAll();
	}

	public Product get(Long id) {
		return repos.findById(id).get();
	}

	public void delete(Long id) {
		repos.deleteById(id);
	}
	

	

}
