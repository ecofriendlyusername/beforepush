package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
