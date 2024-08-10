import java.util.Scanner;

  class Dog{
     static String name = "小狗";
    private static int age = 11;
    public int c = 666;





    static void func(){

        class Cat{
            public int c = 999;
            int age = 12;
            public static final int d = 11;

            public Cat() {
                System.out.println("内部类构造方法");
            }

            public void unc(){
                System.out.println(name+this.c);
                // System.out.println(Dog.this.c);

            }
        }

            Cat cat = new Cat();
            cat.unc();

    }

     public Dog() {
         System.out.println("W不带参数的构造方法");
     }

     {
         System.out.println("W实例代码快");
     }


static{
        System.out.println("W静态代码快");
}




     public static void main(String[] args) {

        Dog dog = new Dog();
        Dog.func();

//        Dog.Cat C = dog.new Cat();

       /* Dog.Cat C1 = new Dog().new Cat();

        C1.func();
*/
//         Dog.Cat cat = new Dog.Cat();
//         cat.func();


     }
}

public class Test {

    int a = 1;
    public void func(){
        System.out.println(a);
    }

    public Test(){
        this(9);
        this.func();
        System.out.println("不带菜蔬的构造方法");
    }

    public Test(int a){
        this.a = a;
        System.out.println("带一个参数的构造方法");

    }

    public static void main(String[] args) {
        System.out.println(Dog.name);
        Dog.func();


    }
    public static void main2(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static void main1(String[] args) {

        short[] arr5;
        arr5 = new short[]{1,2,3,4,5};
        char[] arr3 = {'a'};
        int[] arr = new int[10];
        String[] arr2 = new String[]{"hahahahh"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

        System.out.println();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        char c1 = '帅';
        System.out.println(c1);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);


        byte b1 = 1;
        byte b2 = 2;
        //  byte b3 = b1 + b2;//java: 不兼容的类型: 从int转换到byte可能会有损失

        Scanner sc = new Scanner(System.in);
        while ( sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println(i);
        }

        sc.close();



    }
}
