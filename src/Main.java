import Book.BookList;
import User.AdminUser;
import User.NormalUser;
import User.User;


import java.util.Scanner;

public class Main {

    public static User login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: 1.管理员 2.普通用户");
        int password = sc.nextInt();
        if(password == 1){
            return new AdminUser(username);
        }else {
            return new NormalUser(username);
        }
    }



    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
       while (true) {
           int choice = user.menu();
           //---------到这里能够确定操作哪个用户的哪个方法
           user.doOperation(choice, bookList);
           //---------调用对应的操作
       }
    }
}
