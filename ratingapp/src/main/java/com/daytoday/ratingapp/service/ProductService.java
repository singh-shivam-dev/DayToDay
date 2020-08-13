package com.daytoday.ratingapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daytoday.ratingapp.model.Comment;
import com.daytoday.ratingapp.model.Product;
import com.daytoday.ratingapp.repository.ProductRepository;
import com.daytoday.ratingapp.util.ProductUtility;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	ProductUtility productUtility = new ProductUtility();

	public List<Product> getAllProduct() {
		List<Product> productList = productRepository.findAll();
		if(productList.size() > 0) {
			for(Product prod : productList) {
				productUtility.getRatingDetails(prod);
			}
			return productList;
		}else {
			return new ArrayList<Product>();
		}
	}

	public Product createComments(int id, Comment comment) {
		Optional<Product> product = productRepository.findById(id);
		Product productTemp = product.get(); 
		List<Comment> commentTempList = productTemp.getComment();
		commentTempList.add(comment);
		productTemp.setComment(commentTempList);
		productRepository.save(productTemp);
		product = productRepository.findById(id);
		productUtility.getRatingDetails(product.get());
		return product.get();
	}

}
