package com.cssys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cssys.domain.Student;
import com.cssys.service.AccountService;
import com.cssys.service.StudentService;

@Controller
public class AdminDetailController {
	@Autowired
    private StudentService studentService;
    @Autowired
    private AccountService accountService;
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
	@RequestMapping(value="removeStudent.action")
	public String removeStudent(@RequestParam String sStudent,HttpSession session){
		List<Student>lstudent=(List<Student>) session.getAttribute("studentList");
		Student student=lstudent.get(Integer.parseInt(sStudent));
		studentService.removeStudent(student);
		accountService.deleteAccountByUsername(student.getStudent_id());
		return "forward:toadminStudent.action";
	}
}
