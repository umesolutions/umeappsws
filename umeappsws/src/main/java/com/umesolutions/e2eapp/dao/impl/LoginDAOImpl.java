package com.umesolutions.e2eapp.dao.impl;

import org.springframework.stereotype.Repository;

import com.umesolutions.e2eapp.dao.LoginDAO;
import com.umesolutions.e2eapp.login.LoginDetails;
@Repository  
public class LoginDAOImpl implements LoginDAO {

	@Override
	public LoginDetails getLoginDAOInfo(String username, String password) {
		// TODO Auto-generated method stub
		LoginDetails loginDetails=new LoginDetails();
		loginDetails.setCustomerID("123456");
		loginDetails.setPassword("hello");
		return loginDetails;
	}
}
