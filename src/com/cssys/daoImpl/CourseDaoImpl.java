package com.cssys.daoImpl;

import java.util.List;

import com.cssys.Utils.HibernateUtils;
import com.cssys.dao.CourseDao;
import com.cssys.domain.Course;

public class CourseDaoImpl extends HibernateUtils<Course> implements CourseDao{

	@Override
	public boolean createCourse(Course course) {
		return save(course);
	}

	@Override
	public boolean deleteCourse(Course course) {
		return delete(course);
	}

	@Override
	public boolean updateCourse(Course course) {
		return update(course);
	}

	@Override
	public Course getCourseById(Integer id) {
		Course course=(Course) findByHql("from Course c where c.id=?",new Object[]{id});
		if(course==null){
			return null;
		}
		return course;
	}
	@Override
	public List<Course> getAllCourse() {
		List<Course> course=findByHqlGetList("from Course ",new Object[]{});
		if(!course.isEmpty()){
			return course;
		}
		return null;
	}

}
