package com.cssys.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cssys.domain.Account;
import com.cssys.domain.Course;
import com.cssys.domain.Student;
import com.cssys.service.AccountService;
import com.cssys.service.CourseService;
import com.cssys.service.StudentService;
import com.cssys.dao.AccountDao;
import com.cssys.dao.CourseDao;
import com.cssys.dao.StudentDao;
import com.cssys.daoImpl.*;
public class TestCssys {
	
	@Test
	public void testDataSource()throws SQLException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// System.out.println(ctx);
		DataSource dataSource = ctx.getBean(DataSource.class);

		// System.out.println(dataSource.getConnection().toString());

		SessionFactory sessionFactory = ctx.getBean(SessionFactory.class);
		
	    AccountDao accountDao=(AccountDao) ctx.getBean("accountDao");
	    /*Account account=new Account();
	    account.setUsername(1430610400);
	    account.setPassword("1a2s3d4f");
	    account.setAccount_type(0);
	    Account account1=new Account();
	    account1.setUsername(12345);
	    account1.setPassword("1a2s3d4f");
	    account1.setAccount_type(1);
	    accountDao.createAccount(account);
	    accountDao.createAccount(account1);*/
		/*AccountDao accountDao=(AccountDao) ctx.getBean("accountDao");
		Account account=new Account(4,1234567890,"1a2s3d4f",0);
		accountDao.createAccount(account);
		account.setPassword("123456");
		accountDao.updateAccount(account);
		System.out.print(accountDao.existsUsername(1234567890));
		System.out.println(accountDao.verifyLogin(account));
		CourseDao courseDao=(CourseDao) ctx.getBean("courseDao");
		
		Course course=courseDao.getCourseById(3);
		System.out.print(course.getCourse_name());
		List<Course> cx=courseDao.getAllCourse();
		System.out.print(cx.isEmpty());*/
		/*AccountService acc=(AccountService) ctx.getBean("accountService");
		acc.createAccount(1234567890,"1a2s3d4f",0);
		acc.createAccount(123456,"123456",1);
		acc.createAccount(1234567890,"gbdyua",0);
		System.out.print(acc.studentLogin(1234567890,"1a2s3d4f",0));
		System.out.print(acc.adminLogin(1234567890,"1a2s3d4f",0));
		System.out.print(acc.adminLogin(123456,"123456",1));
		Account account=new Account();
		account.setUsername(1234567890);
		account.setPassword("1a2s3d4f");
		account.setAccount_type(0);
		System.out.print(acc.changePassword(account,"1a2s3d"));*/
		StudentService stu=(StudentService) ctx.getBean("studentService");
		StudentDao stuDao=(StudentDao) ctx.getBean("studentDao");
		CourseDao courseDao=(CourseDao) ctx.getBean("courseDao");
		CourseService cour=(CourseService)ctx.getBean("courseService");
		/*Course course=new Course();
		course.setCourse_name("fuck");
		course.setCourse_num_left(50);
		courseDao.createCourse(course);
		Student stud=stuDao.getStudentById(1);
		Course coure=courseDao.getCourseById(1);
		stu.selectCourse(stud, coure);
		courseDao.deleteCourse(courseDao.getCourseById(1));*/
		//System.out.print(stu.removeCourse(stud, coure));
		/*Student student=new Student();
		student.setStudent_id(12345678);
		stuDao.createStudent(student);
		student.setMajor("Èí¼þ");
		student.setSex(0);
		student.setStudent_name("ÍõÄáÂê");
		stu.createStudent(student);*/
		List<Course> courr=cour.getAllCourseByList();
		if(!courr.isEmpty()){
			System.out.println("nem");
		}
	}
}
