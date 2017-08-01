/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uhg.library.daoimpl;

import com.uhg.library.model.Student;
import com.uhg.library.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.uhg.library.dao.StaffDAO;
import com.uhg.library.model.Staff;

/**
 *
 * @author om
 */
public class StaffDAOImpl implements StaffDAO
{
    
    private Connection conn;
 
    public StaffDAOImpl() 
    {
        conn = DBUtil.getConnection();
    }
    
    @Override
    public void deleteStaff (String staff_id )
    {
        try {
                        String query = "delete from staff where student_id=?";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setString( 1, staff_id);
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addStaff(Staff staff)
    {
        try {
                        String query = "insert into staff (staff_id, password, first_name, last_name, address, mobile_no, destination, deptno, dept_name) values (?,?,?,?,?),?,?,?,?";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setString(1, staff.getStaff_id());
                        preparedStatement.setString( 2, staff.getPassword());
                        preparedStatement.setString( 3, staff.getFirst_name() );
                        preparedStatement.setString( 4, staff.getLast_name() );
                        preparedStatement.setString( 5,staff.getAddress());
                        preparedStatement.setLong(6,staff.getMobile_no());
                        preparedStatement.setString(7,staff.getDesignation());
                        preparedStatement.setInt(8,staff.getDept_no());
                        preparedStatement.setString(9,staff.getDept_name());
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateStaff(Staff staff) {
            try {
            String query = "update staff set  password=?, first_name=?, last_name=?,address=?, mobile_no=?, destination=?, deptno=?, dept_name=? where studentId=?";
            PreparedStatement preparedStatement = conn.prepareStatement( query );
            preparedStatement.setString( 1, staff.getPassword() );
            preparedStatement.setString(2, staff.getFirst_name());
            preparedStatement.setString( 3, staff.getLast_name() );
            preparedStatement.setString( 4, staff.getAddress() );
            preparedStatement.setLong( 5, staff.getMobile_no() );
            preparedStatement.setString( 6, staff.getDesignation() );
            preparedStatement.setInt( 7,staff.getDept_no());
            preparedStatement.setString( 8,staff.getDept_name());
            preparedStatement.setString( 9,staff.getStaff_id());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<Staff> getStaff(String first_name, String last_name)
    {
        List<Staff> staffs = new ArrayList<Staff>();
        try {
            PreparedStatement  statement ;
            statement= conn.prepareStatement( "select * from staff where first_name = ? or last_name = ? " );
            statement.setString(1,first_name);
            statement.setString(2,last_name);
            ResultSet resultSet = statement.executeQuery(); 
            while( resultSet.next() ) {
                Staff staff = new Staff();
                staff.setStaff_id( resultSet.getString( "staff_id" ) );
                staff.setPassword(resultSet.getString("password"));
                staff.setFirst_name( resultSet.getString( "first_name" ) );
                staff.setLast_name( resultSet.getString( "last_name" ) );
                staff.setAddress( resultSet.getString( "address" ) );
                staff.setMobile_no( resultSet.getLong( "mobile_no" ) );
                staff.setDesignation( resultSet.getString( "designation" ) );
                staff.setDept_no( resultSet.getInt( "deptno" ) );
                staff.setDept_name( resultSet.getString( "dept_name" ) );
                staffs.add(staff);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staffs;
    }
    
    @Override
    public List<Staff> getAllStaff()
    {
        List<Staff> staffs = new ArrayList<Staff>();
        try {
            PreparedStatement  statement ;
            statement= conn.prepareStatement( "select * from staff ");
            ResultSet resultSet = statement.executeQuery(); 
            while( resultSet.next() ) {
                Staff staff = new Staff();
                staff.setStaff_id( resultSet.getString( "staff_id" ) );
                staff.setPassword(resultSet.getString("password"));
                staff.setFirst_name( resultSet.getString( "first_name" ) );
                staff.setLast_name( resultSet.getString( "last_name" ) );
                staff.setAddress( resultSet.getString( "address" ) );
                staff.setMobile_no( resultSet.getLong( "mobile_no" ) );
                staff.setDesignation( resultSet.getString( "designation" ) );
                staff.setDept_no( resultSet.getInt( "deptno" ) );
                staff.setDept_name( resultSet.getString( "dept_name" ) );
                staffs.add(staff);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staffs;
    }
    
    @Override
    public Staff getStaff(String staff_id)
    {
        Staff staff =null;
        try {
            PreparedStatement  statement ;
            statement= conn.prepareStatement( "select * from staff where staff_id = " );
            statement.setString(1,staff_id);
            ResultSet resultSet = statement.executeQuery(); 
            if( resultSet.next() ) {
                staff = new Staff();
                staff.setStaff_id( resultSet.getString( "staff_id" ) );
                staff.setPassword(resultSet.getString("password"));
                staff.setFirst_name( resultSet.getString( "first_name" ) );
                staff.setLast_name( resultSet.getString( "last_name" ) );
                staff.setAddress( resultSet.getString( "address" ) );
                staff.setMobile_no( resultSet.getLong( "mobile_no" ) );
                staff.setDesignation( resultSet.getString( "designation" ) );
                staff.setDept_no( resultSet.getInt( "deptno" ) );
                staff.setDept_name( resultSet.getString( "dept_name" ) );
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staff;
    }
    
    @Override
    public boolean validation(String username, String password)
    {
        try {
            PreparedStatement  statement, smt ;
            statement= conn.prepareStatement( "select * from staff where staff_id=?" );
            statement.setString(1,username);
            ResultSet resultSet = statement.executeQuery(); 
            if( resultSet.next() ) {
                smt= conn.prepareStatement( "select * from staff where password=?" );
                smt.setString(1,password);
                ResultSet result= smt.executeQuery();
                if(result.next())
                    return true;
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
