package com.mantis.cicada.dao;

import java.util.List;

import com.mantis.cicada.entity.Book;

public interface BookDao {
	
	/**
	 * 书名匹配
	 * @param bookName
	 * @return
	 */
	List<Book> queryByBookName(String bookName);
	
	Book queryBookById(String bookId);
	
	/**
	 * 通过作者Id查找
	 * @param authorId
	 * @return
	 */
	List<Book> queryByAuthorId(String authorId);
	
	/**
	 * 添加书籍
	 * @param book
	 */
	void insert(Book book);
	
	/**
	 * 删除书籍
	 * @param book
	 */
	void update(Book book);
	
	
}
