package com.payment.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Test")
public class Student {
	private String id;
	private String name;
	private String className;
	private String school;
	
	public Student(String id, String name, String className, String school) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
		this.school = school;
	}

	public Student() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
