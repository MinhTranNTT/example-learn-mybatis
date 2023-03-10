package com.mybatis.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	
	private Integer studId;
	private String name;
	private String email;
	private Date dob;
	
	public Student() {
	}
	
	public Student(Integer studId) {
		this.studId = studId;
	}
	
	public Student(Integer studId, String name, String email, Date dob) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", email="
				+ email + ", dob=" + dob + "]";
	}

	
}
