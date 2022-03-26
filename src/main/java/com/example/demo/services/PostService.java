package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AccountRepository;
import com.example.demo.PostRepository;
import com.example.demo.model.Account;
import com.example.demo.model.Post;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepo;
	@Autowired
	AccountRepository accRepo;

	public void post(String sub, String content) {
		// TODO Auto-generated method stub
		Account acc = accRepo.getBySub(sub);
		Post newPost = new Post();
		acc.addPost(newPost);
		accRepo.save(acc);
	}
}
