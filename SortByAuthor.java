package book;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book>{

	public int compare(Book b1, Book b2) 
	{
		String author1 = b1.getAuthor();
		String author2 = b2.getAuthor();
		
		int b = author1.compareTo(author2);
		
		return b;
	}
}
