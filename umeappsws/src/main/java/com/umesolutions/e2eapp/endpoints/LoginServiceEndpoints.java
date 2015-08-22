package com.umesolutions.e2eapp.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.umesolutions.e2eapp.login.userloginservice.LoginRequest;
import com.umesolutions.e2eapp.login.userloginservice.LoginResponse;
import com.umesolutions.e2eapp.service.LoginService;

@Endpoint  
public class LoginServiceEndpoints {  
  
   
 @Autowired  
 private LoginService loginService;  
   
   @PayloadRoot(localPart = "LoginRequest", namespace = "http://login.e2eapp.umesolutions.com/UserLoginService")    
      public @ResponsePayload LoginResponse getUserDetails(@RequestPayload LoginRequest request)    
      {    
    System.out.println("Get User !");  
    LoginResponse response = new LoginResponse();    
    response.setLoginDetails(loginService.getLoginInfo(request.getUserName(), request.getPassword()));  
          return response;    
      }   
     
     
  
 public void setLoginService(LoginService loginService_i) {  
  this.loginService = loginService_i;  
 }   
     
     
}  
