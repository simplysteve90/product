package it.dst.repos;


import org.springframework.data.repository.CrudRepository;

import it.dst.model.Product;

public interface ProductRepository  extends CrudRepository<Product, Long>{
	
}
