package ex1;

public class Ex1 {
    public static void main(String[] args) {

        Ex1 b1 = new Ex1();
        System.out.println(b1.binominal(5, 2));

    }

    public int binominal(int n, int m) {
        int result = 0;
        if (m == 0 || m == n)
            return 1;
        else if (n >= 0 && m >= 0) {
            result = binominal(n - 1, m) + binominal(n - 1, m - 1);
        }
        return result;
    }
}
