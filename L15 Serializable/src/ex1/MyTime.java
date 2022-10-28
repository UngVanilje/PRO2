package ex1;

import java.io.PipedReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {
    private int time = 0;

    private final List<String> times = new ArrayList<>();


    public MyTime(int time) {
        this.time = time;
    }

    public List<String> getTimes() {
        return times;
    }

    public void increase(){
        time++;
    }

    public void reset(){
        time = 0;
    }

    public int getTime() {
        return time;
    }

    public void saveMyTimeArray(){
        times.add(String.valueOf(time));
    }
}
