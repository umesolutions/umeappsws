package com.umesolutions.e2eapp.dao;

import com.umesolutions.e2eapp.login.LoginDetails;

public interface LoginDAO {
	public LoginDetails getLoginDAOInfo(String username, String password);
}
