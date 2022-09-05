package ex2;

public class Childcare {
    public static void main(String[] args) {

        /*
         * Returns the total payment for a family minus discount
         * Pre: small >= 0, big >= 0
         * (small is the number of preschool children
         * and big is the number of children attending school)
         */
    }

    public int totalPayment (int small, int big){
        int children = small + big;
        int totalPrice = 0;

        if(children == 1){
            totalPrice += small * 1000 + big * 2000;


        }
        return totalPrice;
    }
}
