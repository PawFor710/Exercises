package RomanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void stringToCharTest() {
        //Given
        RomanToInteger romanToInteger = new RomanToInteger();
        //When
        int result = romanToInteger.stringToChar("MCMXCIV");
        //Then
        System.out.println(result);
    }

}