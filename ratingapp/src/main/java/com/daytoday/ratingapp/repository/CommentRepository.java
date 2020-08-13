package com.daytoday.ratingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daytoday.ratingapp.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
