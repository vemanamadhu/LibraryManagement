package com.uhg.library.model;

public class Deliver_staff {
	private String staff_id;
	private int delivery_id;
	private String delivery_date;
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
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
		return "Deliver_staff [staff_id=" + staff_id + ", delivery_id=" + delivery_id + ", delivery_date="
				+ delivery_date + "]";
	}
	
	
}
