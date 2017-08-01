package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Books;

public interface BooksDAO {
	public void addBook (Books book);
	public void updateStatus (int book_id,String status);
	public List<Books> getBook (String author);
	public String getBookStatus (int book_id);
	//public String getBookPosition (int book_id);
	//public String getBookPosition (String title);
	
}
