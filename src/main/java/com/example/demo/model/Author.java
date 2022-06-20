package com.example.demo.model;

import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("AUTHOR")
public class Author {
	@Id
	private int id;
	private String name;
	
	@OneToOne(mappedBy = "author")
	Book book;

}
