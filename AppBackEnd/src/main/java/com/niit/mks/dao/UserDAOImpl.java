package com.niit.mks.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mks.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public User insert(User user) {

		sessionFactory.getCurrentSession().save(user);
		return user;

	}

	public User getUserById(int id) {
		User user = (User) sessionFactory.getCurrentSession().get(User.class, id);
		return user;

	}

	public List<User> getAllUsers() {
		List<User> user = sessionFactory.getCurrentSession().createQuery("from User").list();
		return user;
	}

}
