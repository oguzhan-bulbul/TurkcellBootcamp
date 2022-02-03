package dataAccess.abstracts;

import java.util.ArrayList;

import entities.concrete.User;

public interface UserDao {
	
	void add(User user);
	void login(User user);
	ArrayList<User> getAll();

}
