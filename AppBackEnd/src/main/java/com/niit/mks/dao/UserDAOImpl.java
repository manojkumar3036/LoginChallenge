package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	

	public void insert(User user) {
		
		sessionFactory.getCurrentSession().persist(user);
	
		
		
	}

	public User getUserById(int id) {
		return null;
		
	
		
	}

	public List<User> getAllUsers() {
	List<User> user=sessionFactory.getCurrentSession().createQuery("from User").list();
		return user;
	}
	
	
	

}
