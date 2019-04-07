package com.mantis.cicada.domain.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mantis.cicada.dao.UserDao;
import com.mantis.cicada.entity.User;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("/spring/application-context.xml") 
public class UserTest {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void insertDate() {
		User user = new User();
		user.setAge(13);
		user.setPassword("123");
		user.setUserName("zhangsan");
		userDao.insert(user);
		List<User> users = userDao.queryAll();
		for(User userd : users) {
			System.out.println(userd);
		}
	}

}
