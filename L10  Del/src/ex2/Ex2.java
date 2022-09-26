package ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,4,0,3,0,5,8,10,0,2,5,6));

        Ex2 l1 = new Ex2();
        System.out.println(l1.nul(list1,0 , list1.size() - 1));
    }

    public static int nul(ArrayList<Integer> list) {
        return nul(list, 0, list.size() - 1);
    }

    private static int nul(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if(list.get(l) == 0)
                return 1;
            else
                return 0;
        } else {
            int m = (l + h) / 2;
            int count1 = nul(list, l, m);
            int count2 = nul(list, m + 1, h);
            return count1 + count2;
            }
    }
}
