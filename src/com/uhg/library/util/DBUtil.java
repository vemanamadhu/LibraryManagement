package com.uhg.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DBUtil {
public static Connection getConnection(){
	Connection con=null;
	
		try{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con=DriverManager.getConnection("jdbc:oracle:thin:@librarymanagementdb.cvhmku11tg1d.us-east-2.rds.amazonaws.com:1521","Scott","tiger123");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String hostname="librarymanagementdb.cvhmku11tg1d.us-east-2.rds.amazonaws.com";
			String port="1521";
			String dbName="ORCL";
			String userName="Scott";
			String password="ABCDQWERTY";
				//String driver="oracle:thin";
			String jdbcUrl = "jdbc:oracle:thin://" + hostname + ":" +port + "/" + dbName;
					//+ " "?user=" + userName + "&password=" + password;
			con=DriverManager.getConnection(jdbcUrl,userName,password);
		}
		catch(Exception e)
		{
			System.out.println("catch");
			e.printStackTrace();
		}
		return con;
	}
		public Date convertStringToDate(String dateInString) {
		Date date = null;
		DateFormat dateFormat = null;
		try {
			dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			date = dateFormat.parse(dateInString);
		}
		catch (ParseException e) {
		e.printStackTrace();
			}
		return date;
}
			
    public static void closeConnection( Connection toBeClosed ) {
        if( toBeClosed == null )
            return;
        try {
            toBeClosed.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
