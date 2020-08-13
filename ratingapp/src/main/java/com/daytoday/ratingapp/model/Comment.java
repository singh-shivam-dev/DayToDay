package com.daytoday.ratingapp.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.TABLE) 
	private int commentId;
	private String commentName;
	private String postedBy;
	private int rating;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentName() {
		return commentName;
	}
	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
