package com.uhg.library.model;

public class Books {
	private int book_id;
	private String rack_no;
	private String title;
	private String author;
	private String publisher;
	private int edition;
	private String status;
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getRack_no() {
		return rack_no;
	}
	public void setRack_no(String rack_no) {
		this.rack_no = rack_no;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", rack_no=" + rack_no + ", title=" + title + ", author=" + author
				+ ", publisher=" + publisher + ", edition=" + edition + ", status=" + status + ", count=" + count + "]";
	}
	
	
	

}
