package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Issue_staff;

public interface Issue_staffDAO {
	public void addStaffIssue(Issue_staff issue_staff);
	public void removeStaffIssue(Issue_staff issue_staff);
	public String getIssueDate(int book_id);
	public List<Issue_staff> getIssueDate(String staff_id);
	public String getReturnDate (int book_id);
	public List<com.uhg.library.model.Issue_staff> getReturnDate (String staff_id);
	//public int getReissueNumber (String staff_id, int book_id);

}
