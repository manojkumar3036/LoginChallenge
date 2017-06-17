package com.niit.mks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.mks.dao.UserDAO;
import com.niit.mks.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	// client is sending the data in JSON format. This method has to convert JSON to JAVA
	public @ResponseBody void insertUser(@RequestBody User user)
	{
		userDAO.insert(user);
	}
	
	@RequestMapping(value="/get/alluser", method=RequestMethod.GET)
	public @ResponseBody List<User> getAllUser()
	{
		List<User> users=userDAO.getAllUsers();		
		return users;
	}
	

}
