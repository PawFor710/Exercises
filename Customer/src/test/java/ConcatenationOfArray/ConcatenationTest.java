package ConcatenationOfArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationTest {

    @Test
    void doubleArrayTest() {
        //Given
        Concatenation concatenation = new Concatenation();
        int[] nums = {1, 3, 2, 1};
        //When
        int[] ans = concatenation.getConcatenation(nums);
        //Then
        for (int num : ans) {
            System.out.println(num);
        }
    }

}