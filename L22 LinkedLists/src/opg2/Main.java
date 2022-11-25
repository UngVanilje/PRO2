package opg2;

public class Main {
    public static void main(String[] args) {
        SortedDoubleLinkedList list = new SortedDoubleLinkedList();
        list.printElements();
        System.out.println(list.count());
        list.add("Benny");
        list.add("Charlie");
        list.add("Allan");
        list.add("Dan");

        list.printElements();
        System.out.println(list.count());
        System.out.println();
        System.out.println(list.removeLast());
        System.out.println();
        list.printElements();
        System.out.println();
        System.out.println(list.remove("Benny"));
        System.out.println();
        list.printElements();
        System.out.println();
        System.out.println(list.remove("Lars"));
        System.out.println();

    }
}
