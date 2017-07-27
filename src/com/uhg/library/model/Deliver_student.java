package com.uhg.library.model;

public class Deliver_student {
	private String student_id;
	private int delivery_id;
	private String delivery_date;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public int getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	@Override
	public String toString() {
		return "Deliver_student [student_id=" + student_id + ", delivery_id=" + delivery_id + ", delivery_date="
				+ delivery_date + "]";
	}
	
	
}
