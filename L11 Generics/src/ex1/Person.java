package ex1;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {

    private final T name;
    private final int age;

    public Person(T name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "Age: " + age;
    }


    @Override
    public int compareTo(Person<T> p) {
        return this.name.compareTo(p.name);
    }
}
