package ex3;

public class Ex3 {
    public static void main(String[] args) {

        Ex3 p1 = new Ex3();
        System.out.println(p1.prod(4, 4));
    }
    public int prod(int a, int b){
        int result = 0;
        if (a >= 0 && b >= 0){
            if( a == 1)
                result = b;
            else if (a== 0)
                return result;
            else
                result = (a-1) * b + b;
        }
        return result;
    }
    public int prodRus(int a, int b){
        int result = 0;
        if (a >= 0 && b >= 0){
            if (a== 0)
                return result;
            else if (a % 2 == 0)
                result = (a-1) * b + b;
        }
        return result;
    }


}
