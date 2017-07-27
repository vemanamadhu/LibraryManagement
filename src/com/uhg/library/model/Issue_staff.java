package com.uhg.library.model;

public class Issue_staff {
	private String issue_date;
	private String return_date;
	private int book_id;
	private String staff_id;
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	@Override
	public String toString() {
		return "Issue_staff [issue_date=" + issue_date + ", return_date=" + return_date + ", book_id=" + book_id
				+ ", staff_id=" + staff_id + "]";
	}
	
	
}
