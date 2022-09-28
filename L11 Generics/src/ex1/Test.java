package ex1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ArrayList<Person<Fullname>> persons = new ArrayList<>();

        Person<String> person1 = new Person<>("Jens", 14);

        Fullname f1 = new Fullname("Lars", "Larsen");
        Person<Fullname> p1 = new Person<>(f1, 22);

        System.out.println(person1);
        System.out.println(p1);

        Person<String> person2 = new Person<>("Jesper", 43);
        Person<String> person3 = new Person<>("Peter", 44);

        Fullname f2 = new Fullname("Mads", "Madsen");
        Fullname f3 = new Fullname("Søren", "Sørensen");
        Fullname f4 = new Fullname("Preben", "Prebensen");
        Fullname f5 = new Fullname("Karsten", "Karstensen");
        Fullname f6 = new Fullname("Alexander", "Alexandersen");
        Person<Fullname> p2 = new Person<>(f2, 66);
        Person<Fullname> p3 = new Person<>(f3, 87);
        Person<Fullname> p4 = new Person<>(f4, 33);
        Person<Fullname> p5 = new Person<>(f5, 25);
        Person<Fullname> p6 = new Person<>(f6, 45);

        System.out.println(person1.compareTo(person2));
        System.out.println(p1.compareTo(p3));

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

//        System.out.println("Unsorted list: " + persons);
//        Collections.sort(persons);
//        System.out.println("Sorted list: " + persons);

        System.out.println("Unsorted list: " + persons);
        persons.sort(Person::compareTo);
        System.out.println("Sorted list: " + persons);






    }
}
