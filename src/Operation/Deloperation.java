package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class Deloperation implements IOPeration {

    @Override
    public void work(BookList bookList) {

        int currentSize = bookList.getUsedSize();
        if ( currentSize == 0 ) {
            System.out.println("暑假为空不能删除");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = sc.nextLine();



        int index = -1;

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("没有你要删除的书");
            return;
        }
        for (int i = index ; i < currentSize-1; i++) {
            Book book = bookList.getBook(i+1);
            bookList.setBooks(i,book);
        }
        bookList.setUsedSize(currentSize-1);
    }
}
