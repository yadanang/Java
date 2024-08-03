package Operation;
import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class FindOperation implements IOPeration {
    @Override
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的图书： ");
        String name = sc.nextLine();

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                System.out.println("找到了你查找的书：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("不好意思没有找到你想要查找的图书");
    }
}
