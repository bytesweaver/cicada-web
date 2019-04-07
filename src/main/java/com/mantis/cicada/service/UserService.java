package com.mantis.cicada.service;

import java.util.List;

import com.mantis.cicada.entity.User;

public interface UserService {
	
	List<User> queryAllUser();
	
	void delteUser(int id);
	
	void updateUser(User user);
	
	void insertUser(User user);
}
