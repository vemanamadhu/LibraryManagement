package com.uhg.library.model;

public class Late_fine_student {
	private String date;
	private String mode_of_payment;
	private int student_id;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMode_of_payment() {
		return mode_of_payment;
	}
	public void setMode_of_payment(String mode_of_payment) {
		this.mode_of_payment = mode_of_payment;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	@Override
	public String toString() {
		return "Late_fine_student [date=" + date + ", mode_of_payment=" + mode_of_payment + ", student_id=" + student_id
				+ "]";
	}
	
	
	
	
}
