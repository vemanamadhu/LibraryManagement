package com.uhg.library.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.uhg.library.util.DBUtil;

public class TestConnection {

	public static void main(String[] args) {
		DBUtil dbutil=new DBUtil();
		Connection con=null;
	con=dbutil.getConnection();
		System.out.println("Connection Esatablished");
		try {
			dbutil.createTable("yolo");
		}catch (SQLException e) {
			 
			e.printStackTrace();
		}
		DBUtil.closeConnection(con);
		
		// TODO Auto-generated method stub

	}

}
