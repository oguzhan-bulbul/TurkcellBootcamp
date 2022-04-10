package dataAccess.concrete;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class UserDaoImpl implements UserDao{
	
	private ArrayList<User> users = new ArrayList<>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanici basariyla eklendi.");
		
	}
	@Override
	public void login(User user) {
		System.out.println("Giris Yapildi");
		
		
	}

	@Override
	public ArrayList<User> getAll() {
		return users;		
	}

	
}
