package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookservice;
	
	@PostMapping("/save")
	public Book save(@RequestBody Book book) {
		return bookservice.save(book);
	}
	
	@GetMapping("/getAll")
	public List<Book> getAll(){
		return bookservice.getAll();
	}

}
