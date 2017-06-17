package com.niit.mks.dao;

import java.util.List;

import com.niit.mks.model.User;

public interface UserDAO {
	
	public void insert(User user);
	public User getUserById(int id);
	public List<User> getAllUsers();

}
