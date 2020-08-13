package com.daytoday.ratingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daytoday.ratingapp.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
