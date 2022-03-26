package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(optional=false)
	private Writing writing;
	
	private String ticker;
	private String price; // doesn't have to be numeric since no operations will be done.
}
