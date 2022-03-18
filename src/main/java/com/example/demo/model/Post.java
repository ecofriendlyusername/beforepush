/**
 * 
 */
package com.example.demo.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author 2ndco
 *
 */
@Data
@Entity
public class Post extends Writing {
	private String title;
	@OneToMany(mappedBy="post")
	private List<Comment> comments;
}
