package com.cssys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cssys.domain.Course;
import com.cssys.domain.Student;
import com.cssys.service.CourseService;
import com.cssys.service.StudentService;

@Controller
public class AdminDetailForwardController {
	 @Autowired
	 private CourseService courseService;
	 @Autowired
	 private StudentService studentService;
	 
	 @RequestMapping(value="toadminStudent.action")
	 public String toAdminDetail(HttpSession session){
		 List<Student> studentList=studentService.getAllStudent();
		 session.setAttribute("studentList", studentList);
		 return "adminDetail";
	 }
	 @RequestMapping(value="toadminCourse.action")
	 public String toAdminCourse(HttpSession session){
		 List<Course> courseList=courseService.getAllCourseByList();
		 session.setAttribute("courseList",courseList);
		 return "adminCourse";
	 }
	 public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	@RequestMapping(value="toaddStudent.action")
     public String toAddStudent(){
    	 return "addStudent";
     }
	 
	 @RequestMapping(value="toaddCourse.action")
	 public String toAddCourse(){
		 return "addCourse";
	 }
}
