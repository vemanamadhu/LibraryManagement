package com.uhg.library.dao;

import java.util.List;


import com.uhg.library.model.Issue_student;

public interface Issue_studentDAO {
	
	public void addStudentIssue(Issue_student issue_student);
	public void removeStaffIssue(Issue_student issue_student);
	public List<String> getIssueDate(int book_id);
	public List<String> getIssueDate(String student_id);
	public List<String> getReturnDate (int book_id);
	public List<String> getReturnDate (String student_id);
	public int getReissueNumber (String student_id, int book_id);
	
}
