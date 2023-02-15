package alphabet.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    @Test
    void test() {
        //Given
        Alphabet alphabet = new Alphabet();
        //When
        int result = alphabet.alphabet(new int[] {2, 3,4, 1, 12, 6, 2, 4});
        //Thne
        assertEquals(result, 4);
    }

}