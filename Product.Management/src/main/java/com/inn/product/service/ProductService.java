package com.inn.product.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.inn.product.pojo.ProductModel;

public interface ProductService {

	public ProductModel addNewProduct(ProductModel product);
	public List<ProductModel> getAllProduct();
	//public ResponseEntity<String> updateProduct(Map<String,String>requestMap);
	public ResponseEntity<String> deleteProduct(int id);
	public  Optional<ProductModel>getProductById(int id);
	public ProductModel updateProduct(ProductModel product);
}
