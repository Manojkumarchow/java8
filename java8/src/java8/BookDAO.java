package java8;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	List<Book> allBooks = new ArrayList<>();

	public List<Book> getAllBooks() {
		allBooks.add(new Book(1, "Do Epic Shit"));
		allBooks.add(new Book(3, "Hyper Focus"));
		allBooks.add(new Book(2, "The Courage To Be Disliked"));
		return allBooks;
	}

}
