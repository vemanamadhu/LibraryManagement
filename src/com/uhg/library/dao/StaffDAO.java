package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Staff;

public interface StaffDAO {
	public void addStaff (Staff staff);
	public void deleteStaff (String staff_id );
	public void updateStaff (Staff staff);
	public List<Staff> getAllStaff();
	public List<Staff> getStaff(String staff_id);
	public List<Staff> getStaff(String first_name, String last_name);
}
