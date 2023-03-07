package com.ibm.fscc.loginservice.services;

import com.ibm.fscc.loginservice.shared.LoginDto;
import com.ibm.fscc.loginservice.data.LoginEntity;

public interface LoginService {

	public LoginDto getLogin(String emailId, String password, String userName);

}
