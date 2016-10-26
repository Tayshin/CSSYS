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
@Table(name="course")
public class Course {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Integer id;
    private Integer course_id;
    private String course_name;
    private Integer course_num_left;
    private Integer course_credit;
    @Column(name="course_credit")
    public Integer getCourse_credit() {
		return course_credit;
	}
	public void setCourse_credit(Integer course_credit) {
		this.course_credit = course_credit;
	}

	private List<Student> students=new ArrayList<>();
    
    public Course() {
		
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

	public Course(Integer id,Integer course_id, String course_name, Integer course_num_left,List<Student> students,
			Integer course_credit) {
		super();
		this.id=id;
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_num_left = course_num_left;
		this.students=students;
		this.course_credit=course_credit;
	}
	


	@Column(name="course_id")
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	
	@Column(name="course_name")
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	@Column(name="course_num_left")
	public Integer getCourse_num_left() {
		return course_num_left;
	}
	
	public void setCourse_num_left(Integer course_num_left) {
		this.course_num_left = course_num_left;
	}
	
	
	@ManyToMany(targetEntity=Student.class,cascade=CascadeType.ALL)
	@JoinTable(
	name="student_course",
	joinColumns=@JoinColumn(name="student_id"),
	inverseJoinColumns=@JoinColumn(name="course_id"))
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
}
