package String.incrementor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void test() {
        Kata kata = new Kata();

        System.out.println(kata.incrementString("foo099"));
    }

}