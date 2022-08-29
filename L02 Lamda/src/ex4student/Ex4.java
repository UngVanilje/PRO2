package ex4student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex4 {

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

//        // OBS: Throws exception.
//        for (Runner runner : runners) {
//            if (runner.getLapTime() >= 40) {
//                runners.remove(runner);
//            }
//        }
        System.out.println("-------------------------------------------------------------------------------------");

        //A)
        Iterator<Runner> it1 = runners.iterator();
        while (it1.hasNext()) {
            Runner runner = it1.next();
            if (runner.getLapTime() >= 40){
                it1.remove();
            }
        }
        System.out.println(runners);
        System.out.println("-----------------------------------------------------------------------------------");
        //D)
        removeIf(runners, r -> r.getLapTime() >= 40);
        System.out.println(runners);
        System.out.println("-----------------------------------------------------------------------------------");
        //E)
        runners.removeIf(r -> r.getLapTime() >= 40);
        System.out.println(runners);
    }


    public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter){
        boolean yeet = false;
        Iterator<Runner> it1 = runners.iterator();
        while (it1.hasNext()) {
            Runner runner = it1.next();
                if(filter.test(runner)){
                    it1.remove();
                    yeet = true;
            }
        }
        return yeet;
    }
}