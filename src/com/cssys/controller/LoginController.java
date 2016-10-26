package com.cssys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cssys.domain.Account;
import com.cssys.service.AccountService;
import com.cssys.service.StudentService;

@Controller
public class LoginController {
	 @Autowired
	 private AccountService accountService;
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	@RequestMapping(value="login")
     public String tologin(){
    	 return "login";
     }
     
     @RequestMapping(value="login.action")
     public String login(@RequestParam String loginName,@RequestParam String loginPassword,@RequestParam String accType,HttpSession session){
    	 try{
    		 if(Integer.parseInt(accType)==0){
    			 boolean state=accountService.studentLogin(Integer.parseInt(loginName),loginPassword,Integer.parseInt(accType),session);
    			// System.out.print(state);
    			 if(state==true){
    				 System.out.print(session.getAttribute("student")!=null);
    				 return "userDetail";
    			 }
    		 }
    		 if(Integer.parseInt(accType)==1){
    			 boolean state=accountService.adminLogin(Integer.parseInt(loginName),loginPassword,Integer.parseInt(accType),session);
    			 if(state==true){
    				 return "adminDetail";
    			 }
    		 }
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
             return "loginFail";
     }
}
