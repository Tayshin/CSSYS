package com.cssys.domain;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	
	
	private Integer id;
	private Integer student_id;
	private String student_name;
	//0 male 1 female
	private Integer sex;
	private String major;
	
	@Column(name="sex")
	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
 
	@Column(name="major")
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	private List<Course> courses=new ArrayList<>();
	
	

	

	public Student() {
		
	}

	public Student(Integer id,Integer student_id, String student_name, List<Course> courses,String major,Integer
			sex) {
		super();
		this.id=id;
		this.student_id = student_id;
		this.student_name = student_name;
		this.courses = courses;
		this.major=major;
		this.sex=sex;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public Integer getStudent_id() {
		return student_id;
	}

	
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	
	@Column(name="student_name")
	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	@ManyToMany(targetEntity=Course.class,cascade=CascadeType.ALL)
	@JoinTable(
    name="student_course",
    joinColumns=@JoinColumn(name="course_id"),
    inverseJoinColumns=@JoinColumn(name="student_id"))
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
