package ex4;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    ArrayedList<Integer> list = new ArrayedList<>(10);

        list.add(12);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(18);
        list.add(66);
        list.add(88);
        list.add(99);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
        list.remove(0);
        System.out.println(list);
    }
}
