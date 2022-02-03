package business.concrete;

import javax.security.auth.login.LoginException;

import business.abstracts.UserService;
import core.exceptions.EmailException;
import core.exceptions.LastNameLengthException;
import core.exceptions.NameLengthException;
import core.exceptions.PasswordLengthException;
import core.exceptions.RequiredFieldsException;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class UserManager implements UserService{
	
	private final UserDao userDao;
	
		
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void register(User user) throws NameLengthException, RequiredFieldsException, LastNameLengthException, PasswordLengthException, EmailException {
		checkIfFieldsAreNull(user);
		checkIfNameLengthIsValid(user);
		checkIfLastNameLengthIsValid(user);
		checkIfEmailFormatIsValid(user);
		checkIfPasswordLengthIsValid(user);
		userDao.add(user);
		
	}

	@Override
	public void login(User user) throws LoginException {
		checkIfEmailAndPasswordMatches(user);
		userDao.login(user);
		
	}
	
	private void checkIfPasswordLengthIsValid(User user) throws PasswordLengthException {
		if(user.getPassword().length()<6) {
			throw new PasswordLengthException("Parola 6 karakterden az olamaz.");
		}
	}
	private void checkIfNameLengthIsValid(User user) throws NameLengthException {
		if(user.getName().length()<2) {
			throw new NameLengthException("Isim alani 2 karakterden az olamaz");
		}
	}
	private void checkIfLastNameLengthIsValid(User user) throws LastNameLengthException {
		if(user.getLastName().length()<2) {
			throw new LastNameLengthException("Isim alani 2 karakterden az olamaz");
		}
	}
	private void checkIfEmailAndPasswordMatches(User user) throws LoginException {
		int emailCount =0;
		for(User s : userDao.getAll()) {
			
			if(s.getEmail().equals(user.getEmail())) {
				emailCount++;
				if(s.getPassword().equals(user.getPassword())) {
					System.out.println("Bilgiler Dogrulandi Giris yapiliyor");
				}else {
					throw new LoginException("Sifre Hatali");
				}
			}										
		}
		if(emailCount ==0) {
			throw new LoginException("Sistemde boyle bir kullanici bulunmamaktadir");
		}
	}
	private void checkIfFieldsAreNull(User user) throws RequiredFieldsException {
		if(user.getEmail()==null ||user.getName()==null || user.getLastName()==null || user.getPassword()==null) {
			throw new RequiredFieldsException("Zorunlu alanlar bos birakilamaz");
		}
	}
	private void checkIfEmailFormatIsValid(User user) throws EmailException {
		if(!(user.getEmail().contains("@"))) {
			throw new EmailException("Email Formatiniz Yanlis");
		}
	}
	

}
