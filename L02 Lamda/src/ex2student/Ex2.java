package ex2student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class
Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();

        //A)
        runners.forEach(runner -> System.out.println("Name: " + runner.getName() + " - " + "Laptime: " + runner.getLapTime() + " Seconds"));
        System.out.println("------------------------------------------------");
        //B)
        runners.forEach(runner -> {
            if(runner.getLapTime() < 30)
                System.out.println("Runners with times under 30: " + runner.getName());
        });
        //C)
        System.out.println("------------------------------------------------");
        runners.sort((r1, r2) -> r1.getLapTime() - r2.getLapTime());
        System.out.println("Løbere sorteret efter tid: " + runners);

    }
}