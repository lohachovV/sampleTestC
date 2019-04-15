import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method

    @Test
    public void testAddNegativeAndPositiveValues () {
        assertEquals("5 + -3 must be 2", 2, calc.add(5, -3));
    }


    //TODO
    //add tests for new methods

    @Test
    public void testMultiplyOfTwoPositiveValues () {
        assertEquals("10 * 5 must be 50", 50, calc.multiply(10, 5));
    }

    @Test
    public void testDivisionTwoPositiveValues () {
        assertEquals("6 / 2 must be 3", 3.0, calc.division(6, 2));
    }


    @Test
    public void testSubtractionTwoPositiveValues () {
        assertEquals("15 - 7 must be 8", 8.0, calc.subtraction(15, 7));
    }



    @Test
    public void testSquareRootOfPositiveValue (){
        assertEquals("Square Root of  100 must be 10", 10.0, calc.squareRoot(100));
    }

    @Test
    public void testSquareNumberOfPositiveValue () {
        assertEquals("Square of number 5 to 2 must be 25", 25.0, calc.squareNumber(5));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
