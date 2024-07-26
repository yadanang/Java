public class Animal {
    public String name;
    public int age = 22;

   /* public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public  void eat() {
        System.out.println("吃饭");
    }
    public Animal() {
        System.out.println("父类构造方法");
    }

    public void name(){
        System.out.println("父类");
    }
}

class Dog extends Animal{
    public int age = 11;



    public  void eat() {
        System.out.println("吃狗粮");
    }


    public Dog() {
        System.out.println("子类构造方法");
    }

    public void name(){
        System.out.println("子类");
    }

    public  void print(){
        super.name();
        this.name();
        this.name= "jsk";
    }

    public static void main(String[] args) {
        //Dog d = new Dog();

       // d.print();

        Animal a = new Dog();
        a.eat();
    }
}
