package kr.co.ezenac.project.library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Member> member = new ArrayList<>();
	private ArrayList<Book>   book   = new ArrayList<>();
	private static Library instance = new Library();
	
	private Library() {}
	
	public static Library getInstance() {
		if(instance == null)
			instance = new Library();
		return instance;
	}

	public ArrayList<Member> getMember() {
		return member;
	}

	public void addMember(Member m) {
		member.add(m);
	}

	public ArrayList<Book> getBook() {
		return book;
	}

	public void addBook(Book b) {
		book.add(b);
	}
}
