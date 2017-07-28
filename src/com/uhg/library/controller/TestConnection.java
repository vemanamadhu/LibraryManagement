package com.uhg.library.controller;

import java.sql.Connection;

import com.uhg.library.util.DBUtil;

public class TestConnection {

	public static void main(String[] args) {
		DBUtil dbutil = new DBUtil();
		Connection cn=null;
		cn=dbutil.getConnection();
		System.out.println("Connection established");
		// TODO Auto-generated method stub

	}

}
