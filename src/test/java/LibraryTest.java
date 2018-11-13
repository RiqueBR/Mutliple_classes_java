
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Book book1;
    Book book2;
    Library library;
    Borrower borrower;

    @Before
    public void setUp(){
        borrower = new Borrower();

        library = new Library(3);

        book = new Book(
                "A Song of Ice and Fire",
                "George R R Martin",
                "Sci-Fi"
        );

        book1 = new Book(
                "The Hobbit",
                "J R R Tolkien",
                "Epic Fantasy"
        );

        book2 = new Book(
                "Fate of the Jedi: Outcast",
                "Aaron Allston",
                "Sci-Fi"
        );


    }


    @Test
    public void libraryHasBooks(){
        assertEquals(0, library.checkBooks());
    }

    @Test
    public void libraryCanAdd(){
        library.addBook(book);
        assertEquals(1, library.checkBooks());
    }

    @Test
    public void libraryCanAddIfStockIsLow(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(3, library.checkBooks());
    }

    @Test
    public void borrowerCanBorrowABookFromLibrary(){
        library.addBook(book);
        library.addBook(book1);
        borrower.borrowABook(library);
        assertEquals(1, library.checkBooks());
        assertEquals(1, borrower.checkCollection());

    }

}
