package com.rest.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;

	private String[] courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, String[] courses) {
		super();
		this.name = name;
		this.id = id;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", courses=" + courses + "]";
	}
}
