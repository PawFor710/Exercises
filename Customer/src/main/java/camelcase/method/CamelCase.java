package camelcase.method;

public class CamelCase {

    public String camelCase(String str) {

        String[] words = str.split(" ");

        for (int i = 0; i <= words.length - 1; i++) {
            System.out.println(words[i]);
        }
        return null;
    }
}