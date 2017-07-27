package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Delivery_boy;

public interface Delivery_boyDAO {
	public void addDeliveryBoy (Delivery_boy delivery_boy);
	public void removeDeliveryBoy (int delivery_id);
	public void removeDeliveryBoy (String first_name, String last_name, long mob_no);
	public List<Delivery_boy> getDeliveryBoy (int delivery_id);
	public List<Delivery_boy> getDeliveryBoy (String first_name, String last_name);
	

}
