package book;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book>{

	public int compare(Book b1, Book b2) {
		String publisher1 = b1.getPublisher();
		String publisher2 = b2.getPublisher();
		
		int b = publisher1.compareTo(publisher2);
		
		return b;
	}
}
