package com.mantis.cicada.dao;

import java.util.List;

import com.mantis.cicada.entity.User;

public interface UserDao {
	/**
	 * 查詢所有用戶
	 * @return
	 */
	List<User> queryAll();
	/**
	 * 插入用戶
	 * @param user
	 */
	void insert(User user);
	/**
	 * 刪除用戶
	 * @param id
	 */
	void delete(int id);
	/**
	 * 修改用戶
	 * @param user
	 */
	void update(User user);
}
