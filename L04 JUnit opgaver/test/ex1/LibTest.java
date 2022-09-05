package ex1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class LibTest {


    //----ADULTS
    @Test
    public void calculateFineForAdult1PlusDays() {
        //Arrange
        Lib lib = new Lib();
        //Act
       int fine = lib.calculateFine(LocalDate.of(2022, 8, 25),
               LocalDate.of(2022,8,27), true);
        //Assert
        assertEquals(20, fine);
    }


    @Test
    public void calculateFineForAdult8PlusDays() {
        //Arrange
        Lib lib = new Lib();
        //Act
        int fine = lib.calculateFine(LocalDate.of(2022, 8, 25),
                LocalDate.of(2022,9,5), true);
        //Assert
        assertEquals(60, fine);
    }

    @Test
    public void calculateFineForAdult15PlusDays() {
        //Arrange
        Lib lib = new Lib();
        //Act
        int fine = lib.calculateFine(LocalDate.of(2022, 8, 25),
                LocalDate.of(2022,9,10), true);
        //Assert
        assertEquals(90, fine);
    }
    //----------Children
    @Test
    public void calculateFineForChildren1PlusDays() {
        //Arrange
        Lib lib = new Lib();
        //Act
        int fine = lib.calculateFine(LocalDate.of(2022, 8, 25),
                LocalDate.of(2022,8,27), false);
        //Assert
        assertEquals(10, fine);
    }

    @Test
    public void calculateFineForChildren8PlusDays() {
        //Arrange
        Lib lib = new Lib();
        //Act
        int fine = lib.calculateFine(LocalDate.of(2022, 8, 25),
                LocalDate.of(2022,9,5), false);
        //Assert
        assertEquals(30, fine);
    }

    @Test
    public void calculateFineForChildren15PlusDays() {
        //Arrange
        Lib lib = new Lib();
        //Act
        int fine = lib.calculateFine(LocalDate.of(2022, 8, 25),
                LocalDate.of(2022,9,10), false);
        //Assert
        assertEquals(45, fine);
    }
}