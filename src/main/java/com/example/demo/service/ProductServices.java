package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductServices {

	List<Product> listAll();

	Product save(Product product);

	Product get(Long id);

	void delete(Long id);

}
