package com.adminportal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Book;
import com.adminportal.repository.BookRepository;
import com.adminportal.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	public List<Book> findAll(){
		return(List<Book>) bookRepository.findAll();
	}
	public Book findOne(Long id){
		return bookRepository.findById(id).get();
	}

	public void removeOne(Long id){
		bookRepository.deleteById(id);
	}

}
