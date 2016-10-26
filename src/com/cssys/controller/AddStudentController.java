package com.cssys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cssys.dao.AccountDao;
import com.cssys.dao.StudentDao;
import com.cssys.domain.Account;
import com.cssys.domain.Student;
import com.cssys.service.AccountService;
import com.cssys.service.StudentService;

@Controller
public class AddStudentController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private StudentService studentService;
    
    public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value="addstudent.action")
	public String addStudent(@RequestParam String addNum,@RequestParam String addName,@RequestParam String addPassword,@RequestParam String sex,
			@RequestParam String addMajor){
	    /*System.out.print(addNum);
		System.out.print(addName);
		System.out.print(addPassword);
		System.out.print(sex);
		System.out.print(addMajor);*/
    	try{
    		Account account=new Account();
    		if(!accountService.existsUsername(Integer.parseInt(addNum))){
    		account.setUsername(Integer.parseInt(addNum));
    		account.setPassword(addPassword);
    		account.setAccount_type(0);
    		Student student=new Student();
    		student.setStudent_id(Integer.parseInt(addNum));
    		student.setStudent_name(addName);
    		student.setSex(Integer.parseInt(sex));
    		student.setMajor(addMajor);
    		
    		accountService.createAccount(account);
    		if(studentService!=null){
    			System.out.print("not null");
    		}
    		studentService.createStudent(student);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "adminDetail";
	}
}
