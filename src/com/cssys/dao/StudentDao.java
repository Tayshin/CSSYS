package com.cssys.dao;

import java.util.List;


import com.cssys.domain.Student;



public interface StudentDao {
	 public boolean createStudent(Student student);
     public boolean deleteStudent(Student student);
     public boolean updateStudent(Student student);
     public List<Student> getAllStudent();
	 public Student getStudentById(Integer id);
	 public Student getStudentByStudentId(Integer student_id);
}
