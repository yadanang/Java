package User;

import Operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[]{
                new ExitOperation(),
                new FindOperation(),
                new BoorrwedOperation(),
                new ReturnOperation()
        };
    }
    @Override
    public int menu(){
        System.out.println("++++++++++++++++++++");
        System.out.println("Hello " + name + " 欢迎来到普通用户菜单");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("++++++++++++++++++++");
        System.out.println("请输入你的操作");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
