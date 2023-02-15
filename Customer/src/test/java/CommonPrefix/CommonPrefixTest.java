package CommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonPrefixTest {

    @Test
    void test() {
        //Given
        CommonPrefix commonPrefix = new CommonPrefix();
        //When
        String[] strs = {"flowers", "flow", "flight"};
        System.out.println(commonPrefix.longestCommonPrefix(strs));
    }

}