public class Tset {

    public int a = 1;
    public int b = 2;
    public static  int c = 3;

    public  int sum(int a , int b){
        this.a = a;
        s();
        return a+b;

    }
public  Tset(){

}
    public static void s (){
        Tset tset = new Tset();
        System.out.println("这是一个静态方法"+ tset.a);

    }


    @Override
    public  String toString() {
        return "Tset{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
//static静态方法是存储在静态存储区内的，可以通过类.方法名直接进行调用，
// 不需要进行实例化。
//假设不使用static，那么main()方法在调用时必须先对其实例化，
// 而main()做为程序的主入口显然不可能先对其实例化，
// 所以使用static修饰，可以更方便的直接用类.main()对其调用。
    public static void main(String[] args) {
        /*Tset t = new Tset();
        System.out.println(t);*/
        Tset tset = new Tset();
        System.out.println(c);

    }
}


class Test2{
    public  void main(String[] args) {
       // Tset t = new Tset();
       // System.out.println(t.sum(1, 3));
       // System.out.println(Tset.c);
       // Tset.s();
       /* Tset t = new Tset();
        System.out.println(t);*/
        //System.out.println(a);


    }
}
