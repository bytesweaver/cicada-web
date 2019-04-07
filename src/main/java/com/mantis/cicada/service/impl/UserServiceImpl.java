package com.mantis.cicada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantis.cicada.dao.UserDao;
import com.mantis.cicada.entity.User;
import com.mantis.cicada.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	public List<User> queryAllUser() {
		List<User> users = userDao.queryAll();
		return users;
	}

	public void delteUser(int id) {
		userDao.delete(id);
	}

	public void updateUser(User user) {
		userDao.update(user);
	}

	public void insertUser(User user) {
		userDao.insert(user);
	}

}
