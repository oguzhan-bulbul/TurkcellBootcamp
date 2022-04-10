package business.abstracts;

import javax.security.auth.login.LoginException;

import core.exceptions.EmailException;
import core.exceptions.LastNameLengthException;
import core.exceptions.NameLengthException;
import core.exceptions.PasswordLengthException;
import core.exceptions.RequiredFieldsException;
import entities.concrete.User;

public interface UserService {
	
	void register(User user) throws NameLengthException, RequiredFieldsException, LastNameLengthException, PasswordLengthException, EmailException;
	void login(User user) throws LoginException;

}
