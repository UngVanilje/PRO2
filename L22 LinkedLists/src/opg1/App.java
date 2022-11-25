package opg1;

import citysinglelinkedlist.City;
import citysinglelinkedlist.CitySingleLinkedList;

public class App {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.printElements();
        System.out.println(list.count());
//        list.add("Benny");
//        list.add("Charlie");
//        list.add("Allan");
//        list.add("Dan");
        list.add("rom");
        list.add("london");
        list.add("amsterdam");
        list.add("paris");

        list.printElements();
        System.out.println(list.count());
        System.out.println();
        System.out.println(list.removeLast());
        System.out.println();
        list.printElements();
        System.out.println();
        System.out.println(list.remove("london"));
        System.out.println();
        list.printElements();
        System.out.println();
        System.out.println();
        
    }
}
