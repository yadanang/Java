package Operation;
import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class BoorrwedOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = sc.nextLine();
        int currentSize = bookList.getUsedSize();
        for ( int i = 0; i < currentSize; i++){
            Book book1 = bookList.getBook(i);
            if ( book1.getName().equals(name)){
                if (!book1.isBorrowed()){
                    book1.setBorrowed(true);
                    System.out.println("借阅成功了");
                }else{
                    System.out.println("这本书已经被借走了");
                }
                return;
            }
        }
        System.out.println("没有你要借阅的书");

    }
}
