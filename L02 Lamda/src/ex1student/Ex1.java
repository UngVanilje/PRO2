package ex1student;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        System.out.println(persons);
        System.out.println();

        // A)
        Person p44 = findFirst(persons, p -> p.getAge() == 44);
        System.out.println("Is 44 years old: " + p44);
        //B)
        Person pM = findFirst(persons, p -> p.getName().startsWith("S"));
        System.out.println("Starts with 'M': " + pM);
        //C)
        Person pII = findFirst(persons, p -> p.getName().indexOf("i") != p.getName().lastIndexOf("i"));
        System.out.println("Contains two 'I's:" + pII);
        //D)
        Person pAL = findFirst(persons, p -> p.getAge() == p.getName().length());
        System.out.println("Name with lengts same as age: " + pAL);
        //E)
        List<Person> list1 = findAll(persons, p -> p.getAge() < 30);
        System.out.println();
        System.out.println("All under 30: " + list1);
        //F)
        List<Person> listI = findAll(persons, p -> p.getName().contains("i"));
        System.out.println("All with 'I' in name: " + listI);
        //G)
        List<Person> listS = findAll(persons, p -> p.getName().startsWith("S"));
        System.out.println("Starts with 'S' : " + listS);
        //H)
        List<Person> list5 = findAll(persons, p -> p.getName().length() == 5);
        System.out.println("Name with length 5: " + list5);
        //I)
        List<Person> listLA = findAll(persons, p -> p.getName().length() >= 6 && p.getAge() < 40);
        System.out.println("Name length of 6+ and under 40: " + listLA);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    //E)
    public static List<Person> findAll(List<Person> list, Predicate<Person> filter){
        List<Person> pa = new ArrayList<>();
        for (Person p : list){
            if(filter.test(p))
                pa.add(p);
        }
        return pa;
    }
}
