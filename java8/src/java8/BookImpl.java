package java8;

import java.util.Collections;
import java.util.List;

public class BookImpl {

	public static void main(String[] args) {
		List<Book> listOfBooks = new BookDAO().getAllBooks();
		System.out.println(new BookImpl().listBooksInAlphabeticalOrder(listOfBooks));
	}

	private String listBooksInAlphabeticalOrder(List<Book> listOfBooks) {
		Collections.sort(listOfBooks, (book1, book2) -> book1.getName().compareToIgnoreCase(book2.getName()));
		return listOfBooks.toString();
	}

}
