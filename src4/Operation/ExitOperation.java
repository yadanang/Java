package Operation;

import Book.Book;
import Book.BookList;

public class ExitOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        int currentSize = bookList.getUsedSize();
        for ( int i = 0; i < currentSize; i++ ) {
            bookList.setBooks(i,null);
        }
        bookList.setUsedSize(0);

        System.exit(0);
    }

}
