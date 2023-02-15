package exes.and.ohs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOTest {

    @Test
    void test() {
        //Given
        XO xo = new XO();
        //When
        boolean result = xo.getXO("xxx23424esdsfvxXXOOooo");
        //Then
        assertFalse(result);
    }

}