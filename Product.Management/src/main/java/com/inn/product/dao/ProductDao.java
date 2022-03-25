package com.inn.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inn.product.pojo.ProductModel;

public interface ProductDao extends JpaRepository<ProductModel,Integer>{

}
