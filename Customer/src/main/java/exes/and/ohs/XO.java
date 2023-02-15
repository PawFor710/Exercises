package exes.and.ohs;

public class XO {

    public boolean getXO(String str) {
        int xCounter = 0;
        int oCounter = 0;

        char[] array = str.toCharArray();

        for (char xO : array) {
            if (xO == 'x' || xO == 'X') xCounter++;
            if (xO == 'o' || xO == 'O') oCounter++;
        }
        return xCounter==oCounter;
    }
}
