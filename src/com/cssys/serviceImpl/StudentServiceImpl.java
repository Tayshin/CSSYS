package com.cssys.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cssys.dao.CourseDao;
import com.cssys.dao.StudentDao;
import com.cssys.domain.Course;
import com.cssys.domain.Student;
import com.cssys.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	private CourseDao courseDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public boolean selectCourse(Student student, Course course) {
		try{
			if(course.getCourse_num_left()>0){
			List<Course> courze=student.getCourses();
			for(int i=0;i<courze.size();i++){
				if(courze.get(i)==course){
					return false;
				}
			}
			course.setCourse_num_left(course.getCourse_num_left()-1);
			courseDao.updateCourse(course);
			courze.add(course);
			student.setCourses(courze);
			return studentDao.updateStudent(student);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	
	@Override
	public boolean removeCourse(Student student, Course course) {
		try{
			if(!student.getCourses().isEmpty()){
			List<Course> courze=student.getCourses();
			boolean temp=false;
			//System.out.print(courze.size());
			for(int i=0;i<courze.size();i++){
				if(courze.get(i).getId()==course.getId()){
					courze.remove(i);
					temp=true;
				}
			}
			if(temp==true){
			  System.out.println(courze.size());
			  course.setCourse_num_left(course.getCourse_num_left()+1);
			  courseDao.updateCourse(course);
			  student.setCourses(courze);
			  return studentDao.updateStudent(student);
			}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean createStudent(Student student){
		try{
			return studentDao.createStudent(student);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
		}

	@Override
	public List<Student> getAllStudent() {
		try{
			return studentDao.getAllStudent();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean removeStudent(Student student){
		try{
			return studentDao.deleteStudent(student);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}

	

