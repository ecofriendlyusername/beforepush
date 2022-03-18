package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
