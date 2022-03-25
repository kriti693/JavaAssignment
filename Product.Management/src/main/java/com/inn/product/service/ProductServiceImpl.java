package com.inn.product.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.inn.product.dao.ProductDao;
import com.inn.product.pojo.ProductModel;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;

	@Override
	public ProductModel addNewProduct(ProductModel product) {
		 return dao.save(product);
	}

	private boolean validateAddNewProduct(Map<String, String> requestMap) {
		if (requestMap.containsKey("name") && requestMap.containsKey("price")
				&& requestMap.containsKey("description")) {
			return true;
		}
		return false;
	}

	private ProductModel getProductFromMap(Map<String, String> requestMap, boolean isAdd) {
		ProductModel product = new ProductModel();
		if (isAdd) {
			product.setId(Integer.parseInt(requestMap.get("Id")));
		}
		product.setName(requestMap.get("name"));
		product.setPrice(Float.parseFloat(requestMap.get("price")));
		product.setDescription(requestMap.get("description"));
		return product;
	}

	@Override
	public List<ProductModel> getAllProduct() {

		return dao.findAll();

	}

//	@Override
//	public ResponseEntity<String> updateProduct(Map<String,String>requestMap) {
//		try {
//			if (validateAddNewProduct(requestMap)) {
//				Optional optional = dao.findById(Integer.parseInt(requestMap.get("Id")));
//				if (!optional.isEmpty()) {
//					dao.save(getProductFromMap(requestMap, true));
//					return new ResponseEntity<String>("{\"message\":\"" + "product updated succesfully" + "\"}",
//							HttpStatus.OK);
//				} else {
//					return new ResponseEntity<String>(
//							"{\"message\":\"" + "Product is not there whatever product you updated" + "\"}",
//							HttpStatus.OK);
//				}
//
//			} else {
//				return new ResponseEntity<String>("{\"message\":\"" + "invail Data" + "\"}", HttpStatus.BAD_REQUEST);
//			}
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//		return new ResponseEntity<String>("{\"message\":\"" + "Something went wrong." + "\"}",
//				HttpStatus.INTERNAL_SERVER_ERROR);
//	}

	@Override
	public ResponseEntity<String> deleteProduct(int id) {
		try {
			if (id >= 0) {
				dao.deleteById(id);
				return new ResponseEntity<String>("{\"message\":\"" + "product Deleted succesfully" + "\"}",
						HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("{\"message\":\"" + "invaild productId" + "\"}",
						HttpStatus.BAD_REQUEST);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return new ResponseEntity<String>("{\"message\":\"" + "Something went wrong." + "\"}",
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public Optional<ProductModel> getProductById(int id) {
		 Optional<ProductModel> product=dao.findById(id);
		return product;
		 
	}
	@Override
	public ProductModel updateProduct(ProductModel product)  {
		// TODO Auto-generated method stub
		//ProductModel p = dao.findById(product.getId()).get();
		return dao.save(product);
	}
	

}
