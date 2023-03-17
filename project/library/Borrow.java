package kr.co.ezenac.project.library;

public class Borrow {
	private int memberId;
	private Book book;
	private int borrowDay;
	
	public Borrow(int memberId, Book book, int borrowDay) {
		this.memberId  = memberId;
		this.book 	   = book;
		this.borrowDay = borrowDay;
	}

	public int getMemberId() {
		return memberId;
	}

	public Book getBook() {
		return book;
	}

	public int getBorrowDay() {
		return borrowDay;
	}

}
