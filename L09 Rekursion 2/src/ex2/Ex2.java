package ex2;

public class Ex2 {
    public static void main(String[] args) {

        Ex2 p1 = new Ex2();
        String s = "yeeeey";
        String s1 = "fuck";
        System.out.println(p1.isPalindrome(s));
        System.out.println(p1.isPalindrome(s1));

    }

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            isPalindrome(s.substring(1, s.length() - 1));
            return true;
        }
        else
        return false;
    }
}
