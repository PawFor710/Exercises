package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public RomanToInteger() {}

    public Map<String, Integer> roman() {
        Map<String, Integer> roman = new HashMap<>();

        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        return roman;
    }

    public int translateOneNumber(String romanNumber) {
        return roman().get(romanNumber);
    }

    public int stringToChar(String bigRomanNumber) {
        int result = 0;
        for (int i = 0; i <= bigRomanNumber.length() - 1; i++) {
            String letter = String.valueOf(bigRomanNumber.charAt(i));
            result += translateOneNumber(letter);
        }
        return result;
    }


}
