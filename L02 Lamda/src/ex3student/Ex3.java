package ex3student;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {


        //A))
        List<Integer> talListe = List.of(
                8, 1, 3, 4, 5, 7, 2, 6);

        Iterator<Integer> tal = talListe.iterator();
        while (tal.hasNext()){
            Integer tal1 = tal.next();
            System.out.println(tal1);
        }

        //B))
        System.out.println("-------------------------");
        Map<Integer, Integer> liste = new LinkedHashMap<>();

        liste.put(2,4);
        liste.put(3,9);
        liste.put(4,16);
        liste.put(5,25);
        liste.put(6,36);

        Iterator<Integer> itr2 = liste.keySet().iterator();
        while(itr2.hasNext()){
            Integer key = itr2.next();
            System.out.printf("(%s, %s)\n",key.toString(), liste.get(key).toString());

        }

    }
}