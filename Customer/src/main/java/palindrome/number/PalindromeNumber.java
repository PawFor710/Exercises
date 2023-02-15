package palindrome.number;

import java.util.Arrays;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String xString = Integer.toString(x);

        char[] xArray = xString.toCharArray();

        char[] xReverse = new char[xArray.length];
        int sizeReverse = xReverse.length - 1;

        for (int i = 0; i <= xArray.length - 1; i++) {
            xReverse[i] = xArray[sizeReverse - i];
        }

        return Arrays.equals(xArray, xReverse);
    }
}
