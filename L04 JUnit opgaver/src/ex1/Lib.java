package ex1;

import java.time.LocalDate;

public class Lib {
    public static void main(String[] args) {

        /*
 Returns the amount of the fine according to the table above.
 Pre: calculatedDate < actualDate
 (calculatedDate is the expected return date and
 actualDate is the day you actually return the book)
*/
    }
    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult){
        int fine = calculatedDate.until(actualDate).getDays();
        if(adult) {
            if (fine < 1)
                return 0;
            else if (fine > 1 && fine < 7)
                fine = 20;
            else if (fine > 8 && fine < 14)
                fine = 60;
            else if (fine > 15)
                fine = 90;
        } else{
            if(fine < 1)
                return 0;
            else if (fine > 1 && fine < 7)
                fine = 10;
            else if (fine > 8 && fine < 14)
                fine = 30;
            else
                fine = 45;
        }
        return fine;
    }
}
