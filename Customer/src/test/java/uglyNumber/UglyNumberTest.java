package uglyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberTest {

    @Test
    void uglyNumberTest() {
        //Given
        UglyNumber uglyNumber = new UglyNumber();
        //When & Then
        assertTrue(uglyNumber.isUgly(25));
        assertFalse(uglyNumber.isUgly(14));
    }

}