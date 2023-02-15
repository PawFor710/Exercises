package keep.hydrated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeepHydratedTest {

    @Test
    void test() {
        //Given
        KeepHydrated kh = new KeepHydrated();
        //When
        int result1 = kh.HowMuchLiter(3.0);
        int result2 = kh.HowMuchLiter(6.7);
        int result3 = kh.HowMuchLiter(11.8);
        //Then
        assertEquals(result1, 1);
        assertEquals(result2, 3);
        assertEquals(result3, 5);
    }

}