package com.cssys.daoImpl;

import java.util.List;

import com.cssys.Utils.HibernateUtils;
import com.cssys.dao.StudentDao;
import com.cssys.domain.Course;
import com.cssys.domain.Student;

public class StudentDaoImpl extends HibernateUtils<Student> implements StudentDao{

	@Override
	public boolean createStudent(Student student) {
		return save(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		return delete(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		return update(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		Student student=(Student) findByHql("from Student s where s.id=?",new Object[]{id});
		if(student==null){
			return null;
		}
		return student;
	}
    
	public Student getStudentByStudentId(Integer id){
		Student student=(Student) findByHql("from Student s where s.student_id=?",new Object[]{id});
		if(student==null){
			return null;
		}
		return student;
	}
	@Override
	public List<Student> getAllStudent() {
		List<Student> student=findByHqlGetList("from Student",new Object[]{});
		if(!student.isEmpty()){
			return student;
		}
		return null;
	}
}
