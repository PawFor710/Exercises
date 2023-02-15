package triangle.odd.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOIfNumbersTest {

    @Test
    void test() {
        //Given
        SumOIfNumbers numbers = new SumOIfNumbers();
        //When
        int result = numbers.rowSumOddNumbers(42);
        //Then
        System.out.println(result);
    }
}