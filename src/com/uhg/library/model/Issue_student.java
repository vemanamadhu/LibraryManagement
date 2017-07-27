package com.uhg.library.model;

public class Issue_student {
	private String issue_date;
	private String return_date;
	private int book_id;
	private String student_id;
	private int reissue;
	
	public int getReissue() {
		return reissue;
	}
	public void setReissue(int reissue) {
		this.reissue = reissue;
	}
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
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	@Override
	public String toString() {
		return "Issue_student [issue_date=" + issue_date + ", return_date=" + return_date + ", book_id=" + book_id
				+ ", student_id=" + student_id + ", reissue=" + reissue + "]";
	}
	
	
	

}
