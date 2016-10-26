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
public class DropCourseController {
     @Autowired
     private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	@RequestMapping(value="dropCourse.action")
	public String dropCourse(@RequestParam String sCourse,HttpSession session){
		Student student=(Student) session.getAttribute("student");
		List<Course> studentCourseList=student.getCourses();
		Course course=studentCourseList.get(Integer.parseInt(sCourse));
		studentService.removeCourse(student, course);
		return "userDetail";
	}
}
