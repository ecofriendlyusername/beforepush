package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
