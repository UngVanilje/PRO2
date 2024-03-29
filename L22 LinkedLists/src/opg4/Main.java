package opg4;

public class Main {
    public static void main(String[] args) {
        SortedLinkedList list1 = new SortedLinkedList();
        list1.add("Benny");
        list1.add("Lars");
        list1.add("Allan");
        list1.add("Jan");
        list1.printElements();
        System.out.println(list1.count());

        SortedLinkedList list2 = new SortedLinkedList();
        list2.add("Charlie");
        list2.add("Karsten");
        list2.add("Benny");
        list2.add("Henrik");
        list2.add("Suen");
        list2.printElements();
        System.out.println(list2.count());

        System.out.println();

        list1.addAll(list2);
        list1.printElements();
        System.out.println(list1.count());
    }
}
