package book;

public class Book {
	
	private int members_id;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	   
    public Book(int members_id, String name, String author, String publisher, int quantity) {
		super();
		this.members_id = members_id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getMembers_id() {
		return members_id;
	}
	public void setMembers_id(int members_id) {
		this.members_id = members_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
   
    
    
    public String toString() {
    	return "Member Id="+ members_id + " " + "name=" + name +" "+ "author=" + author +" "+ "publisher=" + publisher +" "+ "quantity=" + quantity;  
    }
}
