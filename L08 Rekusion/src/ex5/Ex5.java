package ex5;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        String path = "D:/caspe/OneDrive/Documents/EAA skole/PRO2/L08 Rekusion/src";
        //scanDir(path);

        scanDirWlvl(path);
    }

    public static void scanDir(String path){
        File root = new File(path);
        File[] list = root.listFiles();

        if(list == null){
            return;
        }

        for(File f : list){
            if (f.isDirectory()) {
                scanDir(f.getAbsolutePath());
                System.out.println(f.getName());
            }
        }
    }

    public static void scanDirWlvl(String path){
        File root = new File(path);
        File[] list = root.listFiles();

        if(list == null){
            return;
        }

        for(File f : list){
            if (f.isDirectory()) {
                List<String> levelstr = Arrays.asList(path.split("/"));
                int level = levelstr.size() - levelstr.indexOf("PRO2-DMU") +1;
                scanDirWlvl(f.getAbsolutePath().replace("\\", "/"));
                System.out.printf("Dir lvl: %d Name: %s\n", level, f.getName());
            }
        }
    }
}