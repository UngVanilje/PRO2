package ex3;

import ex2.Ex2;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 c1 = new Ex3();

        System.out.println("Når n = 0: " + c1.CalcNo(0));
        System.out.println("Når n = 1: " + c1.CalcNo(1));
        System.out.println("Når n = 2: " + c1.CalcNo(2));
        System.out.println("Når n = lige: " + c1.CalcNo(4));
        System.out.println("Når n = ulige: " + c1.CalcNo(5));

    }

    // 3.1
    //no3 = no(n-1) + n(n-2) + 3 * no(n-3) = 5 + 1 + 3 * 2 = 12
    //no4 = 2 * no(n-3) - no(n-1) = 2 * 1 - 11 = -10
    //no5 = no(n-1) + no(n-2) + 3 * no(n-3) = -10 + 12 + 3 * 5 = 17
    //no6 = 2 * no(n-3) - no(n-1) = 2 * 12 - 17 = 7


    //3.2
    public int CalcNo(int n){
        int result = 0;
        if(n == 0)
            return result = 2;
        else if (n == 1)
            return result = 1;
        else if (n == 2)
            return result = 5;
        else if (n > 2  && n % 2 == 0)
            return result = 2 * CalcNo((n-3)) - CalcNo((n-1));
        else
            return result = CalcNo((n-1)) + CalcNo((n-2)) + 3 * CalcNo((n-3));
    }

    //3.3

}
