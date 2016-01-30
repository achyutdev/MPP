/**
 *
 */
package problem9;

/*In the folder lesson9.labs.prob9 there are classes Book and BookCopy, as in the Library project.
Use a lambda/stream pipeline to implement an isAvailable() method in Book that uses the
stream operation reduce (Hint: a Book is available if copy1 is available OR copy2 is available
OR…). To test your code, add a Main class to the package and run the following main method:*/

import java.util.List;

/**
 * @author Achyut Dev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy->copy.changeAvailability());

//		test
		System.out.println("Copy Available Status: "+book.isAvailable(copies));
	}

}
