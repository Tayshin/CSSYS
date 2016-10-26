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
public class ModifyDetailController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private AccountService accountService;
	public StudentService getStudentService() {
		return studentService;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	@RequestMapping(value="changePassword.action")
	public String changePassword(@RequestParam String modifyPassword,HttpSession session){
		Account account=(Account) session.getAttribute("studentAccount");
		accountService.changePassword(account,modifyPassword);
		return "userDetail";
	}
}
