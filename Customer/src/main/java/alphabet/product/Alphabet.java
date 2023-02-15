package alphabet.product;

import java.util.Arrays;

public class Alphabet {


    public int alphabet(int[] ns) {
        Arrays.sort(ns);
        int[] newNs = {ns[0], ns[1], ns[2], ns[3]};
        int max = newNs[0];

        for (int i=0; i <= 3; i++) {
            if (max < newNs[i] ) {
                max = newNs[i];
            }
        }
        return max;
    }
}
