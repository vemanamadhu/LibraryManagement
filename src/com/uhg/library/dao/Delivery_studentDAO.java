package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Deliver_student;

public interface Delivery_studentDAO {
	public List <Deliver_student> getDeliveryDate (String student_id);
	
}
