package com.uhg.library.dao;

import java.util.List;


import com.uhg.library.model.Issue_student;

public interface Issue_studentDAO {
	
	public void addStudentIssue(Issue_student issue_student);
	public void removeStudentIssue(Issue_student issue_student);
	public String getIssueDate(int book_id);
	public List<Issue_student> getIssueDate(String student_id);
	public String getReturnDate (int book_id);
	public List<Issue_student> getReturnDate (String student_id);
	//public int getReissueNumber (String student_id, int book_id);
	
}
