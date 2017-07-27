package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Student;

public interface StudentDAO {
	public void addStudent (Student student);
	public void deleteStudent (String student_id );
	public void updateStudent (Student student);
	public List<Student> getAllStudents();
	public List<Student> getStudent(String student_id);
	public List<Student> getStudent(String first_name, String last_name);
}
