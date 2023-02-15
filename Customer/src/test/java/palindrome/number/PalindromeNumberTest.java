package palindrome.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void test() {
        //Given
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        //When & Then
        System.out.println(palindromeNumber.isPalindrome(101));


    }

}