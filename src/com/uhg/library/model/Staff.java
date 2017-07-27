package com.uhg.library.model;

public class Staff {
	private String staff_id;
	private String password;
	private String first_name;
	private String last_name;
	private String address;
	private String designation;
	private long mobile_no;
	private String dept_name;
	private int dept_no;
	
	
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", password=" + password + ", first_name=" + first_name + ", last_name="
				+ last_name + ", address=" + address + ", designation=" + designation + ", mobile_no=" + mobile_no
				+ ", dept_name=" + dept_name + ", dept_no=" + dept_no + "]";
	}
	
	

}
