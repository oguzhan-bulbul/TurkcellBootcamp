import javax.security.auth.login.LoginException;

import business.concrete.UserManager;
import core.exceptions.EmailException;
import core.exceptions.LastNameLengthException;
import core.exceptions.NameLengthException;
import core.exceptions.PasswordLengthException;
import core.exceptions.RequiredFieldsException;
import dataAccess.concrete.UserDaoImpl;
import entities.concrete.User;

public class Main {

	public static void main(String[] args) throws LoginException, NameLengthException, RequiredFieldsException, LastNameLengthException, PasswordLengthException, EmailException {
		User user = new User("Engin", "Demirog", "engindemirog@gmail.com", "123456");
		User user2 = new User("Engin", "Demirog", "engindemirog@gmail.com", "145666");
		User user3 = new User("Engin", "Demirog", "email@gmail.com", "126");
		User user4 = new User("Engin", "Demirog", "engindemiroggmail.com", "123456");
		User user5 = new User("E", "Demirog", "engindemiroggmail.com", "123");
		User user6 = new User("E", "Demirog", "email@gmail.com", "126455");

		UserManager userManager = new UserManager(new UserDaoImpl());

		userManager.register(user2);
		
		userManager.login(user2);
		userManager.register(user2);
		
		userManager.register(user3);
		userManager.register(user4);
		userManager.register(user5);
		userManager.register(user6);

	}

}
