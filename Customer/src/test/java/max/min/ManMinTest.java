package max.min;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManMinTest {

    @Test
    void test() {
        ManMin min = new ManMin();


        System.out.println(min.binarySearch(new int[] {2, 4, 6, 8, 9, 15}, 15));
    }

}