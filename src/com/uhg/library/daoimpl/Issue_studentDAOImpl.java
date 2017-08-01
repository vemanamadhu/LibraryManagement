/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uhg.library.daoimpl;

import com.uhg.library.dao.Issue_studentDAO;
import com.uhg.library.model.Books;
import com.uhg.library.util.DBUtil;
import com.uhg.library.model.Issue_student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author om
 */
public class Issue_studentDAOImpl implements Issue_studentDAO
{
    private Connection conn;
 
    public Issue_studentDAOImpl() 
    {
        conn = DBUtil.getConnection();
    }
    
    @Override
    public void addStudentIssue(Issue_student issue_student)
    {
        try {
                        String query = "insert into Issue_student (Issue_date, return_date, book_id, student_id) values (?,?,?,?)";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setString(1, issue_student.getIssue_date());
                        preparedStatement.setString( 2, issue_student.getReturn_date());
                        preparedStatement.setInt( 3, issue_student.getBook_id() );
                        preparedStatement.setString( 4, issue_student.getStudent_id() );
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void removeStudentIssue(Issue_student issue_student)
    {
        try {
                        String query = "delete from issue_student where book_id=? and student_id=?";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setInt( 1, issue_student.getBook_id() );
                        preparedStatement.setString( 2, issue_student.getStudent_id() );
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
//    public String getIssueDate(int book_id)
//    {
//        String issue_date=null;
//         try {
//                    PreparedStatement  statement ;
//                    statement= conn.prepareStatement( "select * from issue_student" );
//                    statement.setInt(1,book_id);
//                    ResultSet resultSet = statement.executeQuery(); 
//                    issue_date = resultSet.getString( "issue_date" );
//                    resultSet.close();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//         return issue_date;
//    }
    
    @Override
    public List<Issue_student> getIssueDate(String student_id)
    {
        List<Issue_student> issue_students = new ArrayList<Issue_student>();
         try {
                    PreparedStatement  statement ;
                    statement= conn.prepareStatement( "select * from issue_student where student_id =" );
                    statement.setString(1,student_id);
                    ResultSet resultSet = statement.executeQuery(); 
                    while( resultSet.next() ) {
                    Issue_student issue_student = new Issue_student();
                    issue_student.setBook_id( resultSet.getInt( "book_id" ) );
                    issue_student.setStudent_id( resultSet.getString( "student_id" ) );
                    issue_student.setIssue_date( resultSet.getString( "issue_date" ) );
                    issue_student.setReturn_date( resultSet.getString( "return_date" ) );
                    issue_students.add(issue_student);
            }
                    resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return issue_students;
    }
        
    @Override
    public List<Issue_student> getReturnDate (String student_id)
    {
        List<Issue_student> issue_students = new ArrayList<Issue_student>();
         try {
                    PreparedStatement  statement ;
                    statement= conn.prepareStatement( "select * from issue_student where student_id=?" );
                    statement.setString(1,student_id);
                    ResultSet resultSet = statement.executeQuery(); 
                    while( resultSet.next() ) {
                    Issue_student issue_student = new Issue_student();
                    issue_student.setBook_id( resultSet.getInt( "book_id" ) );
                    issue_student.setStudent_id( resultSet.getString( "student_id" ) );
                    issue_student.setIssue_date( resultSet.getString( "issue_date" ) );
                    issue_student.setReturn_date( resultSet.getString( "return_date" ) );
                    issue_students.add(issue_student);
            }
                    resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return issue_students;
    }

	
	@Override
	public String getIssueDate(int book_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReturnDate(int book_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
