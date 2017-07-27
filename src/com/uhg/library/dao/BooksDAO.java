package com.uhg.library.dao;

import java.util.List;

import com.uhg.library.model.Books;

public interface BooksDAO {
	public void addBook (Books book);
	public void updateStatus (int book_id,String status);
	public Books getBookById (int book_id );
	public List<Books> getBookByTitle (String title);
	public List<Books> getBookByPublisher (String publisher);
	public List<Books> getBooksByAuthor (String author);
	public int getBookStatus(String title);
	public int getBookStatus (int book_id);
	public String getBookPosition (int book_id);
	public String getBookPosition (String title);
	
}
