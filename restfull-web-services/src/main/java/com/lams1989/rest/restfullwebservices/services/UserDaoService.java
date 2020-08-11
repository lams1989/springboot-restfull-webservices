package com.lams1989.rest.restfullwebservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lams1989.rest.restfullwebservices.beans.User;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	
	private static int userCount =3;
	static {
		users.add(new User(1, "luis", new Date()));
		users.add(new User(2, "luisa", new Date()));
		users.add(new User(3, "alejandro", new Date()));
	}
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user){
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
		}
	
	public User findOne(int id){
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
		}
	
	public User deleteById(int id){
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user= iterator.next();
			if(user.getId()==id) {
				iterator.remove();
				return user;
			}
		}
		return null;
		}
}

