package com.uhg.library.model;

public class Student {
	private String student_id;
	private String password;
	private String first_name;
	private String last_name;
	private String address;
	private long mobile_no;
	private String gender;
	
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", address=" + address + ", mobile_no=" + mobile_no + ", gender="
				+ gender + "]";
	}
	
	
	
	
	
}
