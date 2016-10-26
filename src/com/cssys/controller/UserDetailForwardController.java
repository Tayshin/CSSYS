package com.cssys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cssys.domain.Course;
import com.cssys.service.CourseService;

@Controller
public class UserDetailForwardController {
	 @Autowired
	 private CourseService courseService;
	 public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(value="touserDetail.action")
     public String touserDetail(){
    	 return "userDetail";
     }
	 
	 @RequestMapping(value="tomodifyDetail.action")
     public String tomodifyDetail(){
    	 return "modifyDetail";
     }
	 
	 @RequestMapping(value="toselectCourse.action")
     public String toselectedCourse(HttpSession session){
		 List<Course> courseList=courseService.getAllCourseByList();
		 session.setAttribute("courseList",courseList);
    	 return "selectCourse";
     }
	 
	 @RequestMapping(value="toviewAllCourse.action")
     public String toviewAllCourse(HttpSession session){
		 List<Course> courseList=courseService.getAllCourseByList();
		 session.setAttribute("courseList",courseList);
    	 return "viewAllCourse";
     }
	 
	 @RequestMapping(value="toviewSelectedCourse.action")
     public String toviewSelectedCourse(){
    	 return "viewSelectedCourse";
     }
	 
	 @RequestMapping(value="todropCourse.action")
	 public String todropCourse(){
		 return "dropCourse";
	 }
}
