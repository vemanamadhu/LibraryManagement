package com.uhg.library.model;

public class Late_fine_staff {
	private String payment_date;
	private String mode_of_payment;
	private String staff_id;
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public String getMode_of_payment() {
		return mode_of_payment;
	}
	public void setMode_of_payment(String mode_of_payment) {
		this.mode_of_payment = mode_of_payment;
	}
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	@Override
	public String toString() {
		return "Late_fine_staff [payment_date=" + payment_date + ", mode_of_payment=" + mode_of_payment + ", staff_id="
				+ staff_id + "]";
	}
	
	
}
