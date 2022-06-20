package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public interface BookService {
	
	public Book save(Book book);
	
	List<Book> getAll();

}
