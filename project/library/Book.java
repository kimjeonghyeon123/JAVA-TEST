package kr.co.ezenac.project.library;

import java.util.ArrayList;

public class Book {
	private static int code = 0;
	
	private int    bookCode;
	private String bookname;
	private int    ageLimit;
	private int    numOfBook;
	private ArrayList<Member> member = new ArrayList<>(); 
	
	public Book(String bookname, int ageLimit, int numOfBook){
		this.bookname  = bookname;
		this.ageLimit  = ageLimit;
		this.numOfBook = numOfBook;
		bookCode       = ++code;
	}

	public int getBookCode() {
		return bookCode;
	}

	public String getBookname() {
		return bookname;
	}

	public int getAgeLimit() {
		return ageLimit;
	}
	
	public int getNumOfBook() {
		return numOfBook;
	}
	
	public ArrayList<Member> getMember() {
		return member;
	}

	public void borrowBook(Member m) {
		member.add(m);
	}
}
