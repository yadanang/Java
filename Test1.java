import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //判断一个数是否是闰年
        // ①、普通年能被4整除且不能被100整除的为闰年。
        //世纪年能被400整除的是闰年。
/*
        int a = 2024;

        if ( a % 100 == 0) {
            if ( a % 400 == 0 ){
                System.out.println("是闰年");
            }else{
                System.out.println("不是闰年的");
            }

        }else
            if (a % 4 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年的");
            }*/


    /*    String a = "asdfg";//字符串类型的第一个字母大写
        switch (a) {
            case "asdfg":
                System.out.println("asdfg");
                break;
            case "qwert":
                System.out.println("qwert");
                break;
            default:
                System.out.println("null");
                break;
        }*/

//        int num = 1 , p = 1;
//
//       while(p <= 5){
//           num *= p;
//           p++;
//       }
//        System.out.println(num);


        //计算1——100的各个阶乘
      /*  int NUM = 1, tmp = 0;
        while(NUM <= 3){
            int i = 1, num = 1;
            while( i <= NUM){
                num *=  i;
                i++;
            }
            tmp+=num;
            NUM++;
        }
        System.out.println(tmp);*/

        // Scanner sc = new Scanner(System.in);
       /* if (sc.nextInt() == 10){
            System.out.println("小于十");
        }else {
            System.out.println("大于十");*/
      /*  System.out.println("输入一个数字");
        int n = sc.nextInt();
        System.out.println(n);

        sc.nextLine();
        System.out.println("请输入名字");
        String name = sc.nextLine();//调用方法名 会把空格读去 只读空格前next
        System.out.println(name);
        sc.close();*/


        // hasNextInt() 如果此扫描仪输入中的下一个标记可以使用 nextInt()方法解释为默认基数中的int值，则返回true。


       /* Random rand = new Random();
        int t = rand.nextInt(100) , b;
        Scanner a = new Scanner(System.in);


        while (true){
            System.out.println("请输入————>");
             b = a.nextInt();
            if (b < t) {
                System.out.println("猜小了");

            }else if (b > t) {

                System.out.println("猜大了，请继续->");
            }else{
                System.out.println("恭喜猜对了数字是->" + t);
                break;
            }
        }*/


//        Scanner age = new Scanner(System.in);
//        while (true) {
//            int AGE = age.nextInt();
//            if ( AGE <= 18 ){
//                System.out.println("少年");
//            } else if (AGE <= 28) {
//                System.out.println("青年");
//            } else if (AGE <= 55) {
//                System.out.println("中年");
//            }else{
//                System.out.println("老年");
//            }
//        }


        //判断一个数是否是素数
//        Scanner sc = new Scanner(System.in);
//        //2~n-1
//        int n = sc.nextInt();

//        for (int i =2 ; i < n; i++) {
//            if (n % i == 0 ){
//                System.out.println(n+"不是素");
//                break;
//            }

//        }
        // 2~根号n
        /*int i = 2 , n = 19;
            //要取到等于  Math不需要导入包 i++会多执行一次
        for ( ; i <= Math.sqrt(n); i++) {
            if ( n % i == 0) {
                break;
            }
        }
        if (i > Math.sqrt(n)){
            System.out.println(n+"是素数");
        }else{
            System.out.println("不是素数");
        }*/






       /* //水仙花数字

       //1~999999 求出有多少位 然后求出每一位 再求次方和
        for ( int i = 1; i < 999999; i++ ) {
            int count = 0;
            int tmp = i;
            while ( tmp != 0){
                tmp/=10;
                count++;
            }
             tmp = i;
            int sum = 0;
            while ( tmp != 0){
               sum += Math.pow(tmp % 10,count);
               tmp /= 10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }*/

//计算参数中二进制中的1
     /*   int count = 0;
        int n = -1;
        while ( n != 0){
            n &= (n-1);
            count++;
        }
        System.out.println(count);*/


//1~100中有多少个数字9

        /*int count = 0;
        for (int i = 1; i <= 100; i++) {
//    if (i % 10 == 9 || i / 10  == 9) {
//        count++;
//    }
//}

            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }

        }
        System.out.println(count);*/

       /* double sum = 0;
        int flg = 1;
        for(int i = 1; i <= 100; i++){
            sum += 1.0 / i * flg;
            flg = -flg;
        }
        System.out.println(sum);
*/

        //画个X图像
       /* int a = 5;
        for ( int i = 0; i < a; i++ ) {
            for ( int j = 0; j < a; j++ ) {
                if ( i == j || i+j== (a-1)){
                    System.out.print('*');
                }else {
                    System.out.print(' ');
                }

            }

                System.out.println();

        }*/

//获得一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
        /*int a = 7;
         *//*for ( int i = 0; i < 32; i+=2 ) {
    System.out.println(((a >> i) & 1 )+ " ");
}*//*
        for ( int i = 30; i >= 0; i-=2 ) {
            System.out.print(((a >> i) & 1 )+ " ");
        }*/

/*    //求两个数的最大公约数
int a = 0, b = 0 , c = 0;;
 Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
         c = a % b;
 while ( c != 0 ){
        a = b;
        b = c;
     c = a % b;


 }
 System.out.println(b);*/






/*

    public static boolean isLeapYeat(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
            return false;
        }
*/

    /*    boolean flg = isLeapYeat(400);
        System.out.println(flg);*/

        /*}*/
  /*  public static boolean isLeapYeat(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }*/


        /*int sum = 0;
        int num = 3;
        for (int i = 1; i <= num; i++) {
             sum += fac(i);
        }
        System.out.println(sum);
*/

        // System.out.println(add(9, 9,9));

        // }

 /*   public static int fac( int num ) {
        //计算某数的阶乘
        int res = 1;
        for ( int i = 1; i <= num; i++ ) {
            res *= i;
        }
        return res;
    }*/


   /* public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b) {
        return a + b;
    }*/


        //求n的阶乘 n*n-1

        // System.out.println(factor(1));


  /*      System.out.println(sum(10));
    }*/


//    public static int factor(int n){
//        if ( n > 0){
//            return n * factor( n - 1);
//
//        }else {
//            return 1;
//        }
//    }


     /*   System.out.println(sum(1729));
    }
    public static int sum( int num){
        if ( num < 10){
            return num;
        }else {
            return num % 10 + sum(num / 10) ;
        }
    }*/



    }

    public static int fib(int n) {
        if ( n == 1){
            return 0;
        }else if(n == 2 || n == 3){
            return 1;
        }else {
            return fib(n-1) + fib(n-2); 
        }
    }
}
