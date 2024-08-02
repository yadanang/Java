package demo3;

import java.util.Arrays;

public class Test {

    public static void mySoet(Comparable[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if ( arr[j].compareTo(arr[j+1]) > 0){
                    Comparable tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("hangman",11);
        Student student2 = new Student("zhangsan",11);
       // System.out.println(student.compareTo(student2));

        Student[] students = new Student[]{
                new Student("man",11),
                 new Student("san",10),
                 new Student("an",12)
        };

        //Arrays.sort(students);
        mySoet(students);

        System.out.println(Arrays.toString(students));
    }
}







