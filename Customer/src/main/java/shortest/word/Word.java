package shortest.word;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Word {

    public int findShort(String s) {
        String[] words = s.split(" ");

        int minLength = words[0].length();

        for (int i=0; i <= words.length - 1; i++) {
            if (minLength > words[i].length()) {
                minLength = words[i].length();
            }
        }
        return minLength;
    }

    public int find(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
