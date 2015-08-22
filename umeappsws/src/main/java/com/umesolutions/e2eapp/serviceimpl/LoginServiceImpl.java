package com.umesolutions.e2eapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umesolutions.e2eapp.dao.LoginDAO;
import com.umesolutions.e2eapp.login.LoginDetails;
import com.umesolutions.e2eapp.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDAO loginDAO;

	@Override
	public LoginDetails getLoginInfo(String userName, String password) {
		// TODO Auto-generated method stub
		if (userName.equals(loginDAO.getLoginDAOInfo(userName, password).getCustomerID())) {
			System.out.println("Condition Worked out");
			return loginDAO.getLoginDAOInfo(userName, password);
		} else {
			System.out.println("condition Failed");
			return null;
		}
	}
}
