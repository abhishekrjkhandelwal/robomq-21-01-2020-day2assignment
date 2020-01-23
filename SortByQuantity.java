package book;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book>{
	public int compare(Book b1, Book b2) {
		
		int b = b1.getQuantity() - b2.getQuantity();
		
		return b;
	}
}
