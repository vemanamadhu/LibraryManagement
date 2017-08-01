package com.uhg.library.model;

public class Delivery_boy {
	private int deliver_id;
	private String password;
	private String first_name;
	private String last_name;
	private long mobile_no;
	
	public int getDeliver_id() {
		return deliver_id;
	}
	public void setDeliver_id(int deliver_id) {
		this.deliver_id = deliver_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Delivery_boy [delivery_id=" + deliver_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", mobile_no=" + mobile_no + "]";
	}
	
}
	