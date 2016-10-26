package com.cssys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cssys.domain.Course;
import com.cssys.service.CourseService;

@Controller
public class AdminCourseController {
	@Autowired
	private CourseService courseService;
	
	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(value="removeCourse.action")
    public String deleteCourse(@RequestParam String sCourse,HttpSession session){
    	List<Course> courz=(List<Course>) session.getAttribute("courseList");
    	Course course=courz.get(Integer.parseInt(sCourse));
    	courseService.removeCourse(course);
    	return "forward:toadminCourse.action";
    }
}
