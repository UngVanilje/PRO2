package ex0;

import java.util.ArrayList;
import java.util.List;

public class Ex0 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(List.of(1, 6, 8, 2, 5, 7, 6, 9, 0, 10));


        System.out.println("Antal lige tal i liste: " + antalLige(l1));

    }

    private static int antalLige(List<Integer> list,int count, int index) {
        if (index == list.size())
            return count;
        else if (list.get(index) % 2 == 0) {
            return antalLige(list,count + 1, index + 1);
        }
        else
           return antalLige(list,count, index + 1);
    }

    public static int antalLige(List<Integer> list) {
        return antalLige(list,0, 0);
    }
}
