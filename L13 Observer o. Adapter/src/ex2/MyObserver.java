package ex2;

import java.util.List;

public class MyObserver implements Observer{

    public MyObserver(){}

    @Override
    public void update(String s, int i) {
        System.out.printf("%s has been updated, values is now at %d\n", s, i);
    }
}
