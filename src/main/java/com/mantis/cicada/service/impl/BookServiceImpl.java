package com.mantis.cicada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantis.cicada.dao.BookDao;
import com.mantis.cicada.entity.Book;
import com.mantis.cicada.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	public List<Book> queryByName() {
		
		return null;
	}

	public List<Book> queryByAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> insert(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> update(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> delete(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
