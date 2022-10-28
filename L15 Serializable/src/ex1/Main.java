package ex1;

import demopersist.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        MyTime t1 = new MyTime(0);
        MyTime t1 = loadMyTime();

        System.out.println("Timeren er: " + t1.getTime());
        t1.increase();
        System.out.println("Timeren er: " + t1.getTime());
        t1.increase();
        t1.increase();
        System.out.println("Timeren er: " + t1.getTime());
        saveMyTime(t1);
        t1.saveMyTimeArray();
        System.out.println("Gemte tider: " + t1.getTimes());

    }
    public static void saveMyTime(MyTime time){
        String filename = "L15 Serializable/src/ex1/MyTime.ser";
        try(FileOutputStream f_out = new FileOutputStream(filename);
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out)
        ) {

            obj_out.writeObject(time);
            System.out.println("Antal timer er gemt:" + time.getTime());
        } catch (IOException ex) {
            System.out.println("Error writing file");
            System.out.println(ex);
        }
    }
    public static MyTime loadMyTime() {
        String filename1 = "L15 Serializable/src/ex1/MyTime.ser";
        try (FileInputStream f_in = new FileInputStream(filename1);
             ObjectInputStream obj_in = new ObjectInputStream(f_in)
        ) {
            Object obj = obj_in.readObject();
            MyTime time = (MyTime) obj;
            System.out.println("Antal timer er hentet: " + time.getTime());
            return time;
        } catch (ClassCastException ex) {
            System.out.println("Class of serialized object changed");
            System.out.println(ex);
            return null;
        } catch (IOException ex) {
            System.out.println("Error reading file");
            System.out.println(ex);
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Class of serialized object not found");
            System.out.println(ex);
            return null;
        }
    }

}