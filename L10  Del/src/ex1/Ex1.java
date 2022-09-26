package ex1;

import java.util.ArrayList;
import java.util.List;


public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,4,5,3,4,5,8,10,3,2,5,6));

        Ex1 l1 = new Ex1();
        System.out.println(l1.sum(list1,0 , list1.size() - 1));
    }

        public int sum(ArrayList<Integer> list) {
            return sum(list, 0, list.size() - 1);
        }

        private int sum(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
                return list.get(l);
            } else {
                int total = 0;
                int m = (l + h) / 2;
                int sum1 = total + sum(list, l, m);
                int sum2 = total + sum(list, m + 1, h);
            return total = sum1 + sum2;
            }
        }
    }
