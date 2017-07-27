package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Issue_staff;

public interface Issue_staffDAO {
	public void addStaffIssue(Issue_staff issue_staff);
	public void removeStaffIssue(Issue_staff issue_staff);
	public List<String> getIssueDate(int book_id);
	public List<String> getIssueDate(String staff_id);
	public List<String> getReturnDate (int book_id);
	public List<String> getReturnDate (String staff_id);
	public int getReissueNumber (String staff_id, int book_id);

}
