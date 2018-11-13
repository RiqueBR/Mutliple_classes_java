import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int checkBooks() {
        return this.collection.size();
    }


    public void addBook(Book book) {
        if (this.capacity > this.collection.size()) {
            this.collection.add(book);
        }
    }

    // For the logic to work, I must remove the book from the ArrayList first
    // Also, I can specify the function based on the class e.g. Book

    public Book removeBook(){
        Book borrowedBook = null;
        if(this.checkBooks() > 0){
            borrowedBook = this.collection.remove(0);
        }
        return borrowedBook;

    }
}
