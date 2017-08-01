package com.uhg.library.daoimpl;

import com.uhg.library.dao.StudentDAO;
import com.uhg.library.model.Books;
import com.uhg.library.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.uhg.library.model.Student;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentDAOImpl implements StudentDAO 
{
    
    private Connection conn;
 
    public StudentDAOImpl() 
    {
        conn = DBUtil.getConnection();
    }

    @Override
    public void addStudent(Student student)
    {
        try {
                        String query = "insert into Student (student_id, password, first_name, last_name, address, mobile_no, gender) values (?,?,?,?,?)";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setString(1, student.getStudent_id());
                        preparedStatement.setString( 2, student.getPassword());
                        preparedStatement.setString( 3, student.getFirst_name() );
                        preparedStatement.setString( 4, student.getLast_name() );
                        preparedStatement.setString( 5,student.getAddress());
                        preparedStatement.setLong(6,student.getMobile_no());
                        preparedStatement.setString(7,student.getGender());
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateStudent(Student student) {
            try {
            String query = "update student set  password=?, first_name=?, last_name=?,address=?, mobile_no=?, gender=? where studentId=?";
            PreparedStatement preparedStatement = conn.prepareStatement( query );
            preparedStatement.setString( 1, student.getPassword() );
            preparedStatement.setString(2, student.getFirst_name());
            preparedStatement.setString( 3, student.getLast_name() );
            preparedStatement.setString( 4, student.getAddress() );
            preparedStatement.setLong( 5, student.getMobile_no() );
            preparedStatement.setString( 6, student.getGender() );
            preparedStatement.setString( 7,student.getStudent_id());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<Student> getAllStudents(String first_name, String last_name)
    {
        		List<Student> students = new ArrayList<Student>();
        try {
            PreparedStatement  statement ;
            statement= conn.prepareStatement( "select * from student where first_name = ? or last_name = ? " );
            statement.setString(1,first_name);
            statement.setString(2,last_name);
            ResultSet resultSet = statement.executeQuery(); 
            while( resultSet.next() ) {
                Student student = new Student();
                student.setStudent_id( resultSet.getString( "Student_id" ) );
                student.setPassword(resultSet.getString("password"));
                student.setFirst_name( resultSet.getString( "first_name" ) );
                student.setLast_name( resultSet.getString( "last_name" ) );
                student.setAddress( resultSet.getString( "address" ) );
                student.setMobile_no( resultSet.getLong( "mobile_no" ) );
                student.setGender( resultSet.getString( "gender" ) );
                students.add(student);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

	@Override
	public void deleteStudent(String student_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(String student_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validation(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
