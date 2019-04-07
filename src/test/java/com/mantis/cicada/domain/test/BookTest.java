package com.mantis.cicada.domain.test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mantis.cicada.dao.BookDao;
import com.mantis.cicada.entity.Book;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/application-context.xml")
public class BookTest {
	
	@Autowired
	private BookDao bookDao;
	
	@Test
	public void insert() {
		Book book = new Book();
		book.setAuthorId("test");
		book.setBookId("I001");
		book.setBookName("your's name");
		book.setBookType("story");
		book.setPublicDate(new Date());
		bookDao.insert(book);
		
		Book result = bookDao.queryBookById("I001");
		assertEquals(result.getBookName(), "your's name");
	}
}
