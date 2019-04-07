package com.mantis.cicada.dao;

import java.util.List;

import com.mantis.cicada.entity.Author;

public interface AuthorDao {
	
	List<Author> queryAll();
	
	Author queryById(String autorId);
	
	void update(Author author);
	
	void insert(Author author);
	
	void delete(String authorId);
}
