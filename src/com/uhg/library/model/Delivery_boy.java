package com.uhg.library.model;

public class Delivery_boy {
	private int delivery_id;
	private String first_name;
	private String last_name;
	private long mob_no;
	public int getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}
	@Override
	public String toString() {
		return "Delivery_boy [delivery_id=" + delivery_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", mob_no=" + mob_no + "]";
	}
	
	
}
