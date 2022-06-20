package com.example.demo.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.AuthorRepo;
import com.example.demo.repo.BookRepo;
import com.example.demo.service.BookService;

@Service
public class BookServiceImp implements BookService{
	@Autowired
	BookRepo bookrepo;
	
	@Autowired
	AuthorRepo authorrepo; 

	@Override
	public Book save(Book book) {
		return bookrepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		return bookrepo.findAll();
	}

}
