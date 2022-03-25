package com.inn.product.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.inn.product.pojo.ProductModel;
import com.inn.product.service.ProductService;

@RestController
public class ProductRestImpl implements ProductRest {

	@Autowired
	ProductService productService;

	@Override
	public ProductModel addNewProduct(ProductModel product) {

		return productService.addNewProduct(product);

	}

	@Override
	public List<ProductModel> getAllProduct() {
		return productService.getAllProduct();
	}

	@Override
	public ProductModel updateProduct(ProductModel product){

		return productService.updateProduct(product);

	}

	@Override
	public ResponseEntity<String> deleteProduct(int id) {
		try {
			return productService.deleteProduct(id);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return new ResponseEntity<String>("{\"message\":\"" + "Something went wrong." + "\"}",
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public Optional<ProductModel> getProductById(int id) {
		return productService.getProductById(id);
	}

}
