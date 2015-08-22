package com.umesolutions.e2eapp.service;

import com.umesolutions.e2eapp.login.LoginDetails;

public interface LoginService {  
	 public LoginDetails getLoginInfo(String userName, String password);  
	}  
