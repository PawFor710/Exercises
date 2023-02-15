package traingle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void test() {
        //Given
        Triangle triangle = new Triangle();
        //When
        boolean result = triangle.isThisTriangle(1, 2, 2);
        boolean result2 = triangle.isThisTriangle(7, 2, 2);
        boolean result3 = triangle.isThisTriangle(0, 2, 2);
        //Then
        assertTrue(result);
        assertFalse(result2);
        assertFalse(result3);

    }

}