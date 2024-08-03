package User;
import Book.BookList;
import Operation.IOPeration;

public abstract class User {
    protected String name;
    public IOPeration[] ioPerations;//只是定义没有初始化

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
        ioPerations[choice].work(bookList);
    }
}
