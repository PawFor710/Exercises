package Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void test() {
        //Given
        ValidParentheses validParentheses = new ValidParentheses();
        //When & Then
        System.out.println(validParentheses.isValid("{]"));
    }

}