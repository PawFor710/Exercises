package vowel.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void test() {
        //Given
        Counter counter = new Counter();
        //When
        int result = counter.getVowel("abracadabra");
        //Then
        assertEquals(result, 5);
    }

}