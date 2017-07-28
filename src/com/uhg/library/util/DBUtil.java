package com.uhg.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection con=null;
	static{
		try{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con=DriverManager.getConnection("jdbc:oracle:thin:@librarymanagementdb.cvhmku11tg1d.us-east-2.rds.amazonaws.com:1521","Scott","tiger123");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public static Connection getConnection(){
			return con;
	
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

