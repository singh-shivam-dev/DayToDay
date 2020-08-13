package com.daytoday.ratingapp.model;

import java.util.List;

import javax.persistence.*;

@Entity  
@Table(name="products") 
public class Product {
	
	@Id   
	@GeneratedValue(strategy=GenerationType.TABLE) 
	private int productId;
	
	private String productName;
	private String productDescription;
	private String productImage;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="prodid")  
	private List<Comment> comment;
	
	@Transient
	private Rating ratingData;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public Rating getRatingData() {
		return ratingData;
	}
	public void setRatingData(Rating ratingData) {
		this.ratingData = ratingData;
	}
	
}
