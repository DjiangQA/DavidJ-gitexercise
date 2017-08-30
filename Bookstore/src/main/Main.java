package main;

public class Main {

	public static void main(String[] args) {

		BookService bookstore = new BookService();
		BookService deleteBook = new BookService();
		BookService showBooks = new BookService();
		
		
		bookstore.addNewBook("Authorname2","Bookname2","Gname2","date2");
		bookstore.addNewBook("Authorname3","Bookname3","Gname3","date3");
		bookstore.showBooks();
		bookstore.deleteBook(2);
		bookstore.showBooks();
	}

}
