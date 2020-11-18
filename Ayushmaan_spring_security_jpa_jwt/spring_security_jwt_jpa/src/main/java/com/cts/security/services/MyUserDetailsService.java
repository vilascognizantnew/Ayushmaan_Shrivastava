package com.cts.security.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.security.dao.UserDao;
import com.cts.security.models.DaoUser;
import com.cts.security.models.UserInput;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		DaoUser user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
	
	public DaoUser save(UserInput user) {
		DaoUser newUser = new DaoUser();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		
		return userDao.save(newUser);
	}
}
