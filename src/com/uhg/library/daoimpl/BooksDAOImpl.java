
package com.uhg.library.daoimpl;


import com.uhg.library.util.DBUtil;
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

import com.uhg.library.dao.BooksDAO;
import com.uhg.library.model.Books;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BooksDAOImpl implements BooksDAO 
{
    
    private Connection conn;
 
    public BooksDAOImpl() 
    {
        conn = DBUtil.getConnection();
    }
    
    @Override
	public List<Books> getBook(String search_element) {
		List<Books> books = new ArrayList<Books>();
        try {
            PreparedStatement  statement ;
            statement= conn.prepareStatement( "select * from books where title = ? or publisher = ? or author =? " );
            statement.setString(1,search_element);
            statement.setString(2,search_element);
            statement.setString(3,search_element);
            ResultSet resultSet = statement.executeQuery(); 
            while( resultSet.next() ) {
                Books book = new Books();
                book.setBook_id( resultSet.getInt( "book_id" ) );
                book.setTitle( resultSet.getString( "TITLE" ) );
                book.setAuthor( resultSet.getString( "author" ) );
                book.setEdition( resultSet.getInt( "edition" ) );
                book.setPublisher( resultSet.getString( "publisher" ) );
                book.setRack_no( resultSet.getString( "col_no" ) );
                book.setStatus( resultSet.getString( "status" ) );
                books.add(book);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
	}
        
    @Override
	public void addBook(Books book) {
		// TODO Auto-generated method stub
		try {
                        String query = "insert into Books (book_id, title, author, edition, publisher, col_no, status) values (?,?,?,?,?)";
                        PreparedStatement preparedStatement = conn.prepareStatement( query );
                        preparedStatement.setInt(1, book.getBook_id());
                        preparedStatement.setString( 2, book.getTitle());
                        preparedStatement.setString( 3, book.getAuthor() );
                        preparedStatement.setInt( 4, book.getEdition() );
                        preparedStatement.setString( 5,book.getPublisher());
                        preparedStatement.setString(6,book.getRack_no());
                        preparedStatement.setString(7,book.getStatus());
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
        
        @Override
        public void updateStatus(int book_id,String status)
        {
            try {
            String query = "update books set status=? where studentId=?";
            PreparedStatement preparedStatement = conn.prepareStatement( query );
            preparedStatement.setString( 1, status );
            preparedStatement.setInt(2, book_id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        
        @Override
        public String getBookStatus(int book_id)
        {
            String status="";
            try
            {
                PreparedStatement preparedStatement = conn.prepareStatement ( "select status from books where title=?" );
                preparedStatement.setInt( 1, book_id );
                ResultSet resultSet = preparedStatement.executeQuery(); 
                status=resultSet.getString( "status" );
                resultSet.close();
                preparedStatement.close();
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
            return status;
        }
        
}
