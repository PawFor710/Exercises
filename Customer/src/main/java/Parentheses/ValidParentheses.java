package Parentheses;

public class ValidParentheses {

    public boolean isValid(String s) {

        boolean valid = false;

        if (s.length() <= 1) valid = false;
        if (s.contains("(")) {
            valid = false;
            if (s.contains(")")) valid = true;
        }
        if (s.contains("{")) {
            valid = false;
            if (s.contains("}")) valid = true;
        }
        if (s.contains("[")) {
            valid = false;
            if (s.contains("]")) valid = true;
        }

        return valid;
    }
}
