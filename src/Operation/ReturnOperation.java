package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = sc.nextLine();
        int currentSize = bookList.getUsedSize();
        for ( int i = 0; i < currentSize; i++){
            Book book1 = bookList.getBook(i);
            if ( book1.getName().equals(name)){
                book1.setBorrowed(false);
                System.out.println("归还成功了");
                return;
            }
        }
        System.out.println("没有你要归还的书");

    }
}
