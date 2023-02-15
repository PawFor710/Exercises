package Factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialNumberTest {

    @Test
    void FactorialNumberTest1() {

        //Given
        FactorialNumber factorialNumber = new FactorialNumber();

        //When
        int result = factorialNumber.factorial(3);

        //Then
        assertEquals(result, 6);
    }

}