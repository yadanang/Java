package demo深浅拷贝;

class Money implements Cloneable{
    public double m = 19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class person implements Cloneable{
    int age;
    Money m;
    public person(int age) {
        this.age = age;
        this.m = new Money();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
         person tmp = (person) super.clone();
         tmp.m =(Money) this.m.clone();
         return tmp;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                '}';
    }
}

class Test{
    public static void main(String[] args) throws CloneNotSupportedException {
        person person = new person(10);
        person person1 = (person) person.clone();

        System.out.println(person.m.m);
        System.out.println(person1.m.m);
        person.m.m=99;
        System.out.println(person.m.m);
        System.out.println(person1.m.m);
    }
}

