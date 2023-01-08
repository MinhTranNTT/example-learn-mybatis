package com.mybatis.services;

import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mybatis.domain.Student;

public class StudentServiceTest {
	
	private static StudentService studentService;
	
	@BeforeClass
	public static void setup()
	{
		studentService = new StudentService();
		//TestDataPopulator.initDatabase();
	}
	
	@AfterClass
	public static void teardown()
	{
		studentService = null;
	}
	
	@Test
    public void testFindStudentById() 
	{
		Student student = studentService.findStudentById(1);
		assertNotNull(student);
	}

}
