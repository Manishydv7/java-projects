package com.springhibernate.UserDao;

import java.util.List;

import com.springhibernate.Entity.User;
//interface UserDao
public interface UserDao {

	//abstract UserDao interface method
	public int insertUserDetails(User ud);
	public int updateUserDetails(User ud);
	public int deleteUserDetails(User ud);
	public User getSpecificUserDetails(int uid);
	public List<User> getAllDetails();
}
