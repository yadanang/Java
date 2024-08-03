package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class AddOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = sc.nextLine();
        System.out.println("请输入作者：");
        String author = sc.nextLine();
        System.out.println("请输入价格");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入类型");
        String type = sc.nextLine();

        Book book = new Book(name, author, price, type);

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
           Book book1 = bookList.getBook(i);
            if ( book1.getName().equals(name)) {
                System.out.println("书架存在这本书,不能添加");
                return;
            }
        }
        //
        bookList.setBooks(currentSize,book);
         bookList.setUsedSize(currentSize+1);
    }
}
