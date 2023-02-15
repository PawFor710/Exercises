package camelcase.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    @Test
    void test() {
        //Given
        CamelCase camelCase = new CamelCase();
        //When
        System.out.println(camelCase.camelCase("words hurts"));
    }

}