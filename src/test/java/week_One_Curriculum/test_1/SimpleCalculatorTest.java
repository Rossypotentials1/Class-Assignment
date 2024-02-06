package week_One_Curriculum.test_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int actual = simpleCalculator.add(8,7);
        int expected = 15;
        assertEquals(expected,actual);



    }
    @Test
    void multiply(){
        SimpleCalculator cal = new SimpleCalculator();
        int actual = cal.multiply(8,2);
        int expected = 16;
        assertEquals(expected,actual);
    }



}