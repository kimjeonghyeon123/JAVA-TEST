package kr.co.ezenac.project.library.view;

import java.util.ArrayList;

import kr.co.ezenac.project.cost.GeneralCost;
import kr.co.ezenac.project.cost.GoldCost;
import kr.co.ezenac.project.cost.PlatinumCost;
import kr.co.ezenac.project.cost.SilverCost;
import kr.co.ezenac.project.library.Book;
import kr.co.ezenac.project.library.Borrow;
import kr.co.ezenac.project.library.Library;
import kr.co.ezenac.project.library.Member;

public class GenerateDisplay {
	Library library = Library.getInstance();
	
	public static final String TITLE  = "] 책 대여 현황 -> 남은 책 수 : ";
	public static final String LINE   = "--------------------------------\n";
	public static final String HEADER = "이름\t 회원번호  대여기간  대여료\n";
	public static final String LINE2  = "================================\n\n\n";
	
	private StringBuilder builder = new StringBuilder();
	
	public String getDisplay() {
		ArrayList<Book> books = library.getBook();
		
		for(Book book : books) {
			makeHeader(book);
			makeBody(book);
			makeFooter();
		}
		
		return builder.toString();
	}

	private void makeHeader(Book book) {
		builder.append("[" + book.getBookname() + TITLE + (book.getNumOfBook() - book.getMember().size()) + "\n");
		builder.append(LINE);
		builder.append(HEADER);
		builder.append(LINE);
	}

	private void makeBody(Book book) {
		ArrayList<Member> members = book.getMember();
		
		for(Member member : members) {
			builder.append(member.getMemberName() + "  ");
			builder.append(member.getMemberId()   + "\t ");
			cost(member, book);
		}
	}

	private void makeFooter() {
		builder.append(LINE2);
	}
	
	private void cost(Member member, Book book) {
		ArrayList<Borrow> borrows = member.getBorrow();
		GeneralCost[] cost = {new SilverCost(), new GoldCost(), new PlatinumCost()};
		
		for(Borrow borrow : borrows) {
			if(borrow.getBook().getBookCode() == book.getBookCode()) {
				builder.append(borrow.getBorrowDay() + "일     ");
				builder.append(cost[member.getGrade()].returnCost(borrow.getBorrowDay()) + "원");
			}
		}
		builder.append("\n");
	}
}
