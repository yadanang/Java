package demo2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

 /*   @Override
    public boolean equals(Object obj) {
        if ( obj == null ) {return false;}
        if ( this == obj ) {return true;}
        if (! (obj instanceof Person) ) {return false;}
        Person person = (Person) obj;
        return this.name.equals(person.name) && this.age == person.age;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    /*    public  static boolean func (String name1, String name2){
        if( name1 == name2) {return true;}
        return false;
    }*/

    public static void main(String[] args) {
        Person person = new Person("z",17);
        Person person1 = new Person("z",17);
        System.out.println(person.equals(person1));
        System.out.println(person1.hashCode());
        System.out.println(person.hashCode());


    }
}
