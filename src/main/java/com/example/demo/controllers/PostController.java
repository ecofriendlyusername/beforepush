package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.PostService;

@RestController
public class PostController {
	@Autowired
	private PostService postService;
	
	@PostMapping("/post")
	public void post(@AuthenticationPrincipal OAuth2User principal, String content) {
		postService.post(principal.getAttribute("sub").toString(), content);
	}
}