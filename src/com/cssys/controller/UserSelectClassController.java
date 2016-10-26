package com.cssys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cssys.domain.Course;
import com.cssys.domain.Student;
import com.cssys.service.StudentService;

@Controller
public class UserSelectClassController {
     @Autowired
     private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
    @RequestMapping(value="selectCourse.action")
    public String selectCourse(@RequestParam String sCourse,HttpSession session){
    	List<Course> course=(List<Course>) session.getAttribute("courseList");
    	Course courz=course.get(Integer.parseInt(sCourse));
    	Student student=(Student) session.getAttribute("student");
    	studentService.selectCourse(student, courz);
    	return "userDetail";
    }
}
