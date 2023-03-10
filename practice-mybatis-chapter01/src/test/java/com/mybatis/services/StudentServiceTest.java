package com.mybatis.services;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mybatis.domain.Student;

public class StudentServiceTest {

	private static StudentService studentService;

	@BeforeClass
	public static void setup() {
		studentService = new StudentService();
		// TestDataPopulator.initDatabase();
	}

	@AfterClass
	public static void teardown() {
		studentService = null;
	}

	@Test
	public void testFindStudentById() {
		Student student = studentService.findStudentById(1);
		assertNotNull(student);
	}

	@Test
	public void testFindAllStudents() {
		List<Student> students = studentService.findAllStudents();
		assertNotNull(students);

		students.forEach(student -> System.out.println(student));
	}

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		int id = 3;
		student.setStudId(id);
		student.setName("student_" + id);
		student.setEmail("student_" + id + "gmail.com");
		student.setDob(new Date());
		studentService.createStudent(student);
		Student newStudent = studentService.findStudentById(id);
		System.out.println(newStudent);
		assertNotNull(newStudent);
	}

}
