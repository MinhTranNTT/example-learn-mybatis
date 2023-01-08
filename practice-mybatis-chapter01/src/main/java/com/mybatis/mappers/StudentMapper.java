package com.mybatis.mappers;

import java.util.List;

import com.mybatis.domain.Student;

public interface StudentMapper {
	
	List<Student> findAllStudents();
	
	Student findStudentById(Integer id);
}
