package kr.co.ezenac.project.ui;

import kr.co.ezenac.project.library.Book;
import kr.co.ezenac.project.library.Borrow;
import kr.co.ezenac.project.library.Library;
import kr.co.ezenac.project.library.Member;
import kr.co.ezenac.project.library.view.GenerateDisplay;

public class UiMain {
	Library ezenLibrary = Library.getInstance();
	GenerateDisplay display = new GenerateDisplay();
	
	Book book1;
	Book book2;
	Book book3;
	Book book4;
	
	Member member1;
	Member member2;
	Member member3;
	Member member4;
	Member member5;
	
	public static void main(String[] args) {
		UiMain uiMain = new UiMain();
		
		uiMain.createBook();
		uiMain.createMember();
		uiMain.borrowBook();
		
		String s = uiMain.display.getDisplay();
		System.out.println(s);
	}

	public void createBook() {
		book1 = new Book("book1", 15, 5);
		book2 = new Book("book2", 19, 3);
		book3 = new Book("book3", 0, 4);
		book4 = new Book("book4", 7, 1);
		
		ezenLibrary.addBook(book1);
		ezenLibrary.addBook(book2);
		ezenLibrary.addBook(book3);
		ezenLibrary.addBook(book4);
	}
	
	public void createMember() {
		member1 = new Member("member1", 14);
		member2 = new Member("member2", 23);
		member3 = new Member("member3", 5);
		member4 = new Member("member4", 16);
		member5 = new Member("member5", 18);
		
		ezenLibrary.addMember(member1);
		ezenLibrary.addMember(member2);
		ezenLibrary.addMember(member3);
		ezenLibrary.addMember(member4);
		ezenLibrary.addMember(member5);
	}
	
	
	public void borrowBook() {
		addBorrowBook(book1, member1, 3);
		addBorrowBook(book1, member2, 5);
		addBorrowBook(book1, member3, 7);
		addBorrowBook(book1, member4, 3);
		addBorrowBook(book1, member5, 1);
		
		addBorrowBook(book2, member1, 3);
		addBorrowBook(book2, member2, 5);
		addBorrowBook(book2, member3, 7);
		addBorrowBook(book2, member4, 3);
		addBorrowBook(book2, member5, 1);
		
		addBorrowBook(book3, member1, 3);
		addBorrowBook(book3, member2, 5);
		addBorrowBook(book3, member3, 7);
		addBorrowBook(book3, member4, 3);
		addBorrowBook(book3, member5, 1);
	}
	
	public void addBorrowBook(Book book, Member member, int day) {
		System.out.println("[" + member.getMemberName() + "] 님이 [" + book.getBookname() + "] 책을 검색 중입니다.");
		
		if(book.getMember().size() < book.getNumOfBook()) {
			if(book.getAgeLimit() <= member.getMemberAge()) {
				book.borrowBook(member);
				member.addBorrow(new Borrow(member.getMemberId(), book, day));
				System.out.println("[" + book.getBookname() + "] 책을 " + day + "일 동안 빌렸습니다.");
				System.out.println();
			}
			else {
				System.out.println("연령 제한이 걸린 책입니다. 책을 빌리지 못했습니다.");
				System.out.println();
			}
		}
		else {
			System.out.println("[" + book.getBookname() + "] 책이 없어 빌리지 못했습니다.");
			System.out.println();
		}
	}
}