package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
  public static void main(String[] args)
  {
	  try 
	  {
	  ArrayList<Book> books = new ArrayList<Book>();
	  
		  books.add(new Book(105,"Java","James Gosling","James",500));
		  books.add(new Book(103,"c","Dennies Ritchie","Dennies",700));
		  books.add(new Book(102,"python","Guido van","Guido",400));
		  books.add(new Book(104,"ruby","yukihiro","yukihiro",200));
		  books.add(new Book(101,"c++","bjarne stroustrup","yukihiro",300));
		  
          System.out.println("1.sort by name\n2.sort by id\n3.sort by author\n4.sort by publisher\n5.sort by quantity");
		  @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		  
		  int input = sc.nextInt();
		  
		  switch(input) {
		   
			  case 1:  
				  System.out.println("Sort By Name");
				  SortByName n = new SortByName();
				  books.sort(n);
				  System.out.println(books);
				  break;
			  
			  case 2:	  
				  System.out.println("Sort By Id");
				  SortById i = new SortById();
				  books.sort(i);
				  System.out.println(books);
				  break;
				
			  case 3:  
				  System.out.println("Sort By Author");
				  SortByAuthor a = new SortByAuthor();
				  books.sort(a);
				  System.out.println(books);
				  break;
				 
			  case 4:  
				  System.out.println("Sort By Publisher");
				  SortByPublisher p = new SortByPublisher();
				  books.sort(p);
				  System.out.println(books);
				  break;
				  
			  case 5:	  
				  System.out.println("Sort By quantity");
				  SortByQuantity q = new SortByQuantity();
				  books.sort(q);
				  System.out.println(books);
				  break;
				  
			  default:
				 
				  Iterator<Book> itr = books.iterator();
				  
		    	   while(itr.hasNext())
		 	        {
		    		   Object obj = itr.next();
				      Book bo = (Book)obj;
				      System.out.println(bo.getName());
				      System.out.println(bo.getMembers_id());
				      System.out.println(bo.getPublisher());
				      System.out.println(bo.getQuantity());
				      System.out.println(bo.getName());
			        } 
		      
		      }
		  }
		  	
	     catch(Exception e){
		    System.out.println("Exception thrown : " + e); 
	     }
    }
}