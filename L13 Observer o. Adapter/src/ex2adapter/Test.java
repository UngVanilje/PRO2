package ex2adapter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Item snickers = new Food();
        snickers.setName("Snickers");
        snickers.setNetprice(15.50);


        Item broedrister = new ElApplication();
        broedrister.setName("Brødrister");
        broedrister.setNetprice(249.95);

        AlcoBev gin = new AlcoBev(119.95, "Engine Pure");
        Item ginAdapter = new AlcoAdapter(gin);

        ArrayList<Item> items = new ArrayList<>(List.of(snickers,broedrister,ginAdapter));

        System.out.printf("%-14s | %-8s | %s\n", "Navn", "Net Pris", "VAT");
        System.out.println("-----------------------------------");

        for(Item i : items)
            System.out.printf("%-14s | %-8.2f | %.2f\n", i.getName(), i.getNetprice(), i.calcVAT());
    }
}
