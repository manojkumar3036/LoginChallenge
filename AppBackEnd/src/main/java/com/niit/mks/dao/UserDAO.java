package com.niit.mks.dao;

import java.util.List;

import com.niit.mks.model.User;

public interface UserDAO {
	
	public boolean insert(User user);
	public boolean getUserById();
	public List<User> getAllUsers();

}
