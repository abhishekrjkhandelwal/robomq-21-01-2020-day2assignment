package book;

import java.util.Comparator;

public class SortById implements Comparator<Book>{
  
	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		int cm = b1.getMembers_id() - b2.getMembers_id();
		return cm;
	}
}