package com.cssys.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cssys.dao.CourseDao;
import com.cssys.domain.Course;
import com.cssys.service.CourseService;

public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public boolean addCourse(Course course) {
		try{
			return courseDao.createCourse(course);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean removeCourse(Course course) {
		try{
			return courseDao.deleteCourse(course);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
    
	public List<Course> getAllCourseByList(){
		try{
			return courseDao.getAllCourse();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
