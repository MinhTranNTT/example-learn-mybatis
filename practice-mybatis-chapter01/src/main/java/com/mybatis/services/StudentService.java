package com.mybatis.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mybatis.domain.Student;
import com.mybatis.mappers.StudentMapper;
import com.mybatis.utils.MyBatisSqlSessionFactory;

public class StudentService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<Student> findAllStudents() {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findAllStudents();
		} finally {
			sqlSession.close();
		}
	}
	
	
	public Student findStudentById(Integer id) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		
		try {
			logger.debug("Select Student By ID :{}", id);
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentById(id);
		} finally {
			sqlSession.close();
		}
	}
	
	public void createStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.insertStudent(student);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	
	
	
	
	
}
