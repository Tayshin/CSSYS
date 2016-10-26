package com.cssys.service;

import java.util.List;

import com.cssys.domain.Course;

public interface CourseService {
     public boolean addCourse(Course course);
     public boolean removeCourse(Course course);
     public List<Course> getAllCourseByList();
}
