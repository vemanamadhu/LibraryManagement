/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uhg.library.daoimpl;

import com.uhg.library.dao.Issue_staffDAO;
import com.uhg.library.model.Books;
import com.uhg.library.model.Issue_staff;
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
public class Issue_staffDAOImpl implements Issue_staffDAO
{
    private Connection conn;
 
    public Issue_staffDAOImpl() 
    {
        conn = DBUtil.getConnection();
    }
    
    @Override
    public void addStaffIssue(Issue_staff issue_staff)
    {
        try {
                        String query = "insert into Issue_staff (Issue_date, return_date, book_id, staff_id) values (?,?,?,?)";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setString(1, issue_staff.getIssue_date());
                        preparedStatement.setString( 2, issue_staff.getReturn_date());
                        preparedStatement.setInt( 3, issue_staff.getBook_id() );
                        preparedStatement.setString( 4, issue_staff.getStaff_id() );
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void removeStaffIssue(Issue_staff issue_staff)
    {
        try {
                        String query = "delete from issue_staff where book_id=? and staff_id=?";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setInt( 1, issue_staff.getBook_id() );
                        preparedStatement.setString( 2, issue_staff.getStaff_id() );
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getIssueDate(int book_id)
    {
        String issue_date=null;
         try {
                    PreparedStatement  statement ;
                    statement= conn.prepareStatement( "select * from issue_staff" );
                    statement.setInt(1,book_id);
                    ResultSet resultSet = statement.executeQuery(); 
                    issue_date = resultSet.getString( "issue_date" );
                    resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return issue_date;
    }
    
    @Override
    public List<Issue_staff> getIssueDate(String student_id)
    {
        List<Issue_staff> issue_staffs = new ArrayList<Issue_staff>();
         try {
                    PreparedStatement  statement ;
                    statement= conn.prepareStatement( "select * from issue_staff where staff_id =" );
                    statement.setString(1,student_id);
                    ResultSet resultSet = statement.executeQuery(); 
                    while( resultSet.next() ) {
                    Issue_staff issue_staff = new Issue_staff();
                    issue_staff.setBook_id( resultSet.getInt( "book_id" ) );
                    issue_staff.setStaff_id( resultSet.getString( "student_id" ) );
                    issue_staff.setIssue_date( resultSet.getString( "issue_date" ) );
                    issue_staff.setReturn_date( resultSet.getString( "return_date" ) );
                    issue_staffs.add(issue_staff);
            }
                    resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return issue_staffs;
    }
    
    @Override
    public String getReturnDate (int book_id)
    {
     String return_date=null;
         try {
                    PreparedStatement  statement ;
                    statement= conn.prepareStatement( "select * from issue_staff where book_id=?" );
                    statement.setInt(1,book_id);
                    ResultSet resultSet = statement.executeQuery(); 
                    return_date = resultSet.getString( "return_date" );
                    resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return return_date;   
    }
    
    @Override
    public List<Issue_staff> getReturnDate (String staff_id)
    {
        List<Issue_staff> issue_staffs = new ArrayList<Issue_staff>();
         try {
                    PreparedStatement  statement ;
                    statement= conn.prepareStatement( "select * from issue_staff where staff_id=?" );
                    statement.setString(1,staff_id);
                    ResultSet resultSet = statement.executeQuery(); 
                    while( resultSet.next() ) {
                    Issue_staff issue_staff = new Issue_staff();
                    issue_staff.setBook_id( resultSet.getInt( "book_id" ) );
                    issue_staff.setStaff_id( resultSet.getString( "student_id" ) );
                    issue_staff.setIssue_date( resultSet.getString( "issue_date" ) );
                    issue_staff.setReturn_date( resultSet.getString( "return_date" ) );
                    issue_staffs.add(issue_staff);
            }
                    resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return issue_staffs;
    }
}
