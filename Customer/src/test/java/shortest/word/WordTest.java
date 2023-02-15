package shortest.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void test() {
        //Given
        Word word = new Word();
        //When
        int i = word.findShort("bitcoin take over the world maybe who knows perhaps");
        int k = word.find("bitcoin take over the world maybe who knows perhaps");
        //Then
        assertEquals(i, 3);
        assertEquals(k, 3);

    }

}