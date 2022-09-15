package ex3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] arrayInt = {5, 10, 5, 6, 4, 9, 8};
        double[] arrayDouble = {5.0, 7.5, 6.667, 6.5, 6.0, 6.5, 6.714 };

        System.out.println(Arrays.toString(prefixAverage(arrayInt)));
    }


    public static double[] prefixAverage(int[] input){
        double sum = 0;
        double[] array = new double[input.length];

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            array[i] = sum / i + 1;
        }
        return array;
    }

}
