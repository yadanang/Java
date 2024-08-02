package demo1;

public class Test {

    public static void test1 (Animal animal){
        animal.eat();
    }
    public static void test2 (IFlying flying){
        flying.fly();
    }
    public static void test3 (IRunning runnig){
        runnig.run();
    }
    public static void test4 (ISwinmming swinmming){
        swinmming.swim();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小狗子",33);
        Bird bird = new Bird("小鸟子",22);
        Robot robot = new Robot();

        test3(robot);

        test1(dog);
        test1(bird);

        //test2(dog);
        test2(bird);
        test3(dog);
        test3(bird);
        test4(dog);
       // test4(bird);



    }

}
