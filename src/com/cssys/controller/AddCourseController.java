package com.cssys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cssys.domain.Course;
import com.cssys.service.CourseService;

@Controller
public class AddCourseController {
     @Autowired
     private CourseService courseService;

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	@RequestMapping(value="addCourse.action")
    public String addCourse(@RequestParam String addCourseNum,@RequestParam String addCourseName,@RequestParam String
    		addCourseCredit,@RequestParam String addCourseLeft){
    	try{
    		Course course=new Course();
    		course.setCourse_id(Integer.parseInt(addCourseNum));
    		course.setCourse_credit(Integer.parseInt(addCourseCredit));
    		course.setCourse_name(addCourseName);
    		course.setCourse_num_left(Integer.parseInt(addCourseLeft));
    		courseService.addCourse(course);
    		return "adminDetail";
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "adminDeteil";
    }
}
