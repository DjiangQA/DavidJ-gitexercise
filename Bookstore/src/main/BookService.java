package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BookService {

	private final int INITIAL_COUNT = 1;
	private Map<Integer, Book> bookMap;
	private int ID;

	public BookService() {
		this.bookMap = new HashMap<Integer, Book>();
		ID = INITIAL_COUNT;
		initBookStore();
	}

	public void addNewBook(String aName,String bName,String gName,String Publish) {
		ID++;
		Book newBook = new Book(aName,bName,gName,Publish);
		bookMap.put(ID, newBook);
	}
	
	public String deleteBook(Integer bookId) {
		System.out.println("deleting books books");
		bookMap.remove(bookId);
		return "Book removed";
	}
	
	public void showBooks() {
		for (Entry<Integer, Book> entry : bookMap.entrySet()) {
			  Integer key = entry.getKey();
			  Book value = entry.getValue();
			  System.out.print(key + " ");
			  System.out.print(bookMap.get(key).getTitle()+ " ");
			  System.out.print(bookMap.get(key).getAuthor() + " ");
			  System.out.print(bookMap.get(key).getGenre() + " ");
			  System.out.println(bookMap.get(key).getYearPublished() + " ");
			  
			}
	}

	private void initBookStore() {
		Book aBook = new Book("James Herbert", "Rats", "Horror", "1988");
		Book aBook2 = new Book("name2", "Rats2", "Horror", "1989");
		bookMap.put(1, aBook);
		bookMap.put(2, aBook2);
	}

}
