package maskify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaskifyTest {

    @Test
    void maskTest() {
        //Given
        Maskify mask = new Maskify();
        //When
        String none = mask.maskify("");
        String one = mask.maskify("1");
        String something = mask.maskify("Ski");
        String somethingMore = mask.maskify("Skippy");

        String noneTwo = mask.maskifyTwo("");
        String oneTwo = mask.maskifyTwo("1");
        String somethingTwo = mask.maskifyTwo("Ski");
        String somethingMoreTwo = mask.maskifyTwo("Skippy");
        //Then
        assertEquals("", none);
        assertEquals("1", one);
        assertEquals("Ski", something);
        assertEquals("##ippy", somethingMore);

        assertEquals("", noneTwo);
        assertEquals("1", oneTwo);
        assertEquals("Ski", somethingTwo);
        assertEquals("##ippy", somethingMoreTwo);
    }

}