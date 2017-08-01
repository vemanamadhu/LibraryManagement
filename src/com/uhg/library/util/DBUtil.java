package com.uhg.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
			con=DriverManager.getConnection("jdbc:oracle:thin:@librarymanagementdb.cvhmku11tg1d.us-east-2.rds.amazonaws.com:1521/ORCL","Scott","ABCDQWERTY");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return con;
		}
			public static void createTable(String table) throws SQLException{
				Statement stmt=null;
				stmt=getConnection().createStatement();
				String sql = "CREATE TABLE REGISTRATION " +
						"(id INTEGER not NULL, " +
						" first VARCHAR(255), " + 
						" last VARCHAR(255), " + 
						" age INTEGER, " + 
						" PRIMARY KEY ( id ))"; 
	 //stmt.executeQuery(sql);
	 
				sql = "INSERT INTO Registration " +
               "VALUES (101, 'Mahnaz', 'Fatma', 25)";
  //stmt.executeUpdate(sql);
				sql = "SELECT id, first, last, age FROM Registration";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
          //Retrieve by column name
		          int id  = rs.getInt("id");
		          int age = rs.getInt("age");
		          String first = rs.getString("first");
		          String last = rs.getString("last");
		
		          //Display values
		          System.out.print("ID: " + id);
		          System.out.print(", Age: " + age);
		          System.out.print(", First: " + first);
		          System.out.println(", Last: " + last);
       }
       rs.close();
       
       sql="create table Student( student_id varchar(10) primary key not null, password varchar(16) default 'gaurav123', first_name varchar(20) default 'gaurav', last_name varchar(20) default 'sonkar',address varchar(100) not null, mobile_no integer default 8332964474,gender varchar(6) default 'male', age integer )";
       //stmt.executeQuery(sql);
       String[] queires={
    		   
    		   
    		   
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Evans','John' ,'password4', 'd_4')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Frank','Jennifer' ,'password5', 'd_5')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Ghosh', 'Robert','password6', 'd_6')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Hills','Elizabeth' ,'password7', 'd_7')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Irwin','Michael' ,'password8', 'd_8')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Jones','Linda' ,'password9', 'd_9')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Klein','William' ,'password9', 'd_10')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Lopez', 'Barbara','password10', 'd_11')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Nalty', 'David','password11', 'd_12')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Ochoa', 'Susan','password12', 'd_13')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Patel','Richard' ,'password13', 'd_14')",
    		          "INSERT INTO delivery_boy (last_name,first_name,password,deliver_id) VALUES ('Quinn','Joseph' ,'password14', 'd_15')"};
       
       
       for (String query : queires) {
    	   	System.out.println(query);    		
    	   	stmt.execute(query);
   	}
       sql="create table issue_student(issue_date varchar(20), return_date varchar(20), book_id integer, student_id varchar(20), constraint fk_iss foreign_key(student_id) references student(student_id) constraint fk_isb foreign_key(book_id) references books(book_id))";
       //stmt.execute(sql);
       
//       ResultSet rs1 = stmt.executeQuery("SELECT * FROM delivery_boy");
//       ResultSetMetaData rsmd = rs1.getMetaData();
//       int columnCount = rsmd.getColumnCount();
//
//       // The column count starts from 1
//       for (int i = 1; i <= columnCount; i++ ) {
//         String name = rsmd.getColumnName(i);
//         System.out.println(name);
//         // Do stuff with name
//       }
       System.out.println("Table created");
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
            System.out.println("Connection closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
