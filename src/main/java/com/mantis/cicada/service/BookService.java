package com.mantis.cicada.service;

import java.util.List;

import com.mantis.cicada.entity.Book;

public interface BookService {
	
	List<Book> queryByName();
	
	List<Book> queryByAuthor();
	
	List<Book> insert(Book book);
	
	List<Book> update(Book book);
	
	List<Book> delete(String bookId);
}
