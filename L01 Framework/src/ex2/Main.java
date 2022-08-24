package ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        Set<Student> students = new LinkedHashSet<>();
        Map<Integer, Student> students = new LinkedHashMap<>();



        College c1 = new College("Burger Bitches");
        Student s1 = new Student(123456, "Bob");
        Student s2 = new Student(234567,"Lars");
        Student s3 = new Student(345678, "Søren");
        Student s4 = new Student(456789,"Jesper");
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//        students.add(s4);
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);


        s1.addGrade(7);
        s1.addGrade(10);
        s1.addGrade(12);
        s2.addGrade(2);
        s2.addGrade(4);
        s2.addGrade(2);
        s3.addGrade(7);
        s3.addGrade(7);
        s3.addGrade(7);
        s4.addGrade(10);
        s4.addGrade(10);
        s4.addGrade(12);

        System.out.println(s1.toString() + s2 + s3 + s4);

    }
}
