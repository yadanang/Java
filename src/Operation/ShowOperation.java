package Operation;

import Book.Book;
import Book.BookList;

public class ShowOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
       int currentSize = bookList.getUsedSize();
       for ( int i = 0; i < currentSize; i++ ) {
           Book book = bookList.getBook(i);
           System.out.println(book);
       }
    }
}
