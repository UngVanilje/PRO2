package ex2;

public class Ex2 {
    public static void main(String[] args) {

        Ex2 p1 = new Ex2();
        System.out.println(p1.power(4, 5));
        System.out.println(p1.power2(5, 7));
    }

    public int power(int n, int p) {
        int result = 0;
        if (p == 1) {
            result = 1;
        } else if (p > 0)
            result = power(n, p - 1) * n;

        return result;
    }

    public int power2(int n, int p) {
        int result = 0;
        if (p == 1) {
            result = 1;
        } else if (p % 2 == 1)
            result = power(n, p - 1) * n;
          else
            result = power2(n * n, p / 2);

        return result;
    }
}
