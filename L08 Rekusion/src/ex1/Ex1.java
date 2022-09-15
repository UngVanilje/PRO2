package ex1;

public class Ex1 {
    public static void main(String[] args) {

        Ex1 f1 = new Ex1();
        System.out.println(f1.factorial(10));
    }
    public int factorial(int n) {
        int result = 0;
        if (n > 0) {
            if (n == 1) {
                result = 1;
            } else {
                result = n * factorial(n - 1);
            }
        }
        return result;
    }
}
