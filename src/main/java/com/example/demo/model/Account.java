package com.example.demo.model;

import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data // to be replaced
public class Account {
	@Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String userid;
	private String email;
	
	@OneToMany(mappedBy="account")
	private List<Post> posts;
	@OneToMany(mappedBy="account")
	private List<Comment> comments;
	public void addPost(Post p1) {
		// TODO Auto-generated method stub
		if (posts == null) posts = new ArrayList<Post>();
		posts.add(p1);
	}
	public void addComment(Comment c1) {
		// TODO Auto-generated method stub
		if (comments == null) comments = new ArrayList<Comment>();
		comments.add(c1);
	}
}
