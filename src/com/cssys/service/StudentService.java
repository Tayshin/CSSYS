package com.cssys.service;

import java.util.List;

import com.cssys.domain.Course;
import com.cssys.domain.Student;

public interface StudentService {
    public boolean selectCourse(Student student,Course course);
    public boolean removeCourse(Student student,Course course);
    public boolean createStudent(Student student);
    public List<Student> getAllStudent();
    public boolean removeStudent(Student student);
}
