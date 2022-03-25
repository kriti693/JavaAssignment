package com.inn.product.rest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inn.product.pojo.ProductModel;

@RequestMapping(path="/product")
@CrossOrigin(origins="http://localhost:3000/")
public interface ProductRest {
	
	@PostMapping(path="/addNewproduct")
	public  ProductModel addNewProduct(@RequestBody(required=true) ProductModel product);
	
	@GetMapping(path="/getAllProduct")
	public List<ProductModel>getAllProduct();
	
	@PostMapping(path="/updateProduct")
	public ProductModel updateProduct(@RequestBody(required=true)ProductModel product);
	 
	
	@DeleteMapping(path="/deleteProduct/{Id}")
	public ResponseEntity<String>deleteProduct(@PathVariable("Id") int id);
	
	@GetMapping(path="/getProductById/{id}")
	public  Optional<ProductModel>getProductById(@PathVariable int id);
}
