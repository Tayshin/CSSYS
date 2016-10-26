package com.cssys.dao;

import java.util.List;

import com.cssys.domain.Course;

public interface CourseDao {
     public boolean createCourse(Course course);
     public boolean deleteCourse(Course course);
     public boolean updateCourse(Course course);
     public Course getCourseById(Integer id);
     public List<Course> getAllCourse();
}  
