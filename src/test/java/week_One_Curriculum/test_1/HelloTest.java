package week_One_Curriculum.test_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void myHello() {
        Hello hello = new Hello();

        String actual = hello.myHello();
        String expected = "Hello World";
        assertEquals(expected, actual);
    }
}