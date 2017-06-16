package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.mks.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	

	public boolean insert(User user) {
		try {
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean getUserById() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
