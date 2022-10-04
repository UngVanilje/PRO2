package ex2;

import java.security.Key;
import java.util.*;
import java.util.function.Consumer;

public class ObservableBag implements Bag, Iterable<String>{
    private final Map<String, Integer> map = new HashMap<>();
    private final List<Observer> observers;


    public ObservableBag(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers(String s, int antal) {
        for(Observer observer : observers){
            observer.update(s, antal);
        }
    }


    @Override
    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public void addString(String s) {
        map.put(s, getCount(s) + 1);
        notifyObservers(s,getCount(s));
    }

    @Override
    public void removeString(String s) {
        map.remove(s, getCount(s));
        notifyObservers(s,getCount(s));
    }

    @Override
    public int getCount(String s) {
        if(map.containsKey(s))
            return map.get(s);
        else
            return 0;
    }
}
