package com.daytoday.ratingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daytoday.ratingapp.model.Comment;
import com.daytoday.ratingapp.model.Product;
import com.daytoday.ratingapp.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> productList = productService.getAllProduct();
		return new ResponseEntity<List<Product>>(productList, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/{productId}")
	public Product createComments(@RequestBody Comment comment, @PathVariable("productId") int id){
		Product product = productService.createComments(id,comment);
		return product;
	}
}
