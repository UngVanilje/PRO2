package ex2;
import java.util.Comparator;

public class Customer {
    private int number;
    private String name;
    private static Comparator<Customer> comp;

    public Customer(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static Comparator<Customer> getComp() {
        return comp;
    }

    public static void setComp(Comparator<Customer> comp) {
        Customer.comp = comp;
    }

    @Override
    public String toString() {
        return "" + name + " " + number;
    }
}