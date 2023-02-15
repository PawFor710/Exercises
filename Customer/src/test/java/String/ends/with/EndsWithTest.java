package String.ends.with;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndsWithTest {

    @Test
    void test() {
        //Given
        EndsWith ends = new EndsWith();
        //When
        boolean result = ends.endsWith("abc", "bc");
        boolean result2 = ends.endsWith("ails", "fails");
        boolean result3 = ends.endsWith("!@#$%^&*() :-)", "");

        boolean resultB = ends.endsWith("abc", "bc");
        boolean result2B = ends.endsWith("ails", "fails");
        boolean result3B = ends.endsWith("!@#$%^&*() :-)", "");
        //Then
        assertTrue(result);
        assertFalse(result2);
        assertTrue(result3);

        assertTrue(resultB);
        assertFalse(result2B);
        assertTrue(result3B);
    }

}