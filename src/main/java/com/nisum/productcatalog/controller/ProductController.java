package com.nisum.productcatalog.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.data.Product;
import com.nisum.productcatalog.exception.CustomeException;

@RestController
@RequestMapping("/products")
public class ProductController {
	
@GetMapping
public ResponseEntity<List<Product>> getProducts() throws CustomeException {
	
	List<Product> list = new ArrayList<Product>();
	Product product = new Product(UUID.randomUUID(), "Jeans");
	
	list.add(product);
	
	//throw new CustomeException();
   return new ResponseEntity<>(list, HttpStatus.OK);
	

		
}

}
