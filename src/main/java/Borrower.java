import java.util.ArrayList;

public class Borrower {


    Book book;
    private ArrayList<Book> myCollection;


    public Borrower() {
        this.myCollection = new ArrayList<Book>();

    }

    public int checkCollection(){
        return this.myCollection.size();
    }

    public void addBook_myCollection(Book book){
        this.myCollection.add(book);
    }

    public void borrowABook(Library library){
        Book borrowedBook = library.removeBook();
        this.addBook_myCollection(borrowedBook);
    }
}
