package sum.of.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void test() {
        //Given
        Sum sum = new Sum();
        //When
        int result = sum.GetSum(0, 1);
        //Then
        System.out.println(result);
    }

}