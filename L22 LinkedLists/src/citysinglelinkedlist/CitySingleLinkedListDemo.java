package citysinglelinkedlist;

public class CitySingleLinkedListDemo {

    public static void main(String[] args) {
        City paris = new City("Paris", 12000000);
        City rom = new City("Rom", 900000);
        City london = new City("London", 900000);
        City amsterdam = new City("Amsterdam", 700000);
        citysinglelinkedlist.City oslo = new City("Oslo", 12000);

        CitySingleLinkedList list = new CitySingleLinkedList();
        list.addFirst(oslo);
        list.addFirst(rom);
        list.addFirst(london);
        list.addFirst(amsterdam);
        list.addFirst(paris);

        System.out.println(list);
        System.out.println("Samlet antal indbyggere: " + list.totalInhabitants());
        System.out.println("COUNT: " + list.count());
        System.out.println();

        list.removeCity(rom);
        list.removeFirst();

        System.out.println(list);
        System.out.println("Samlet antal indbyggere: " + list.totalInhabitants());
        System.out.println("COUNT: " + list.count());
        System.out.println();
    }
}
