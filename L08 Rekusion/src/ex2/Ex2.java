package ex2;

public class Ex2 {
    public static void main(String[] args) {

        Ex2 p1 = new Ex2();
        System.out.println(p1.power(4, 5));
        System.out.println(p1.power2(5, 7));
    }

    public int power(int n, int p) {
        if (p == 0)
            return 1;
            else  return power(n, p - 1) * n;
    }

    public int power2(int n, int p) {
        if (p == 0)
            return 1;
            else if (p % 2 != 0) return n * power(n, p - 1);
             else return power2(n * n, p / 2);
    }
}
