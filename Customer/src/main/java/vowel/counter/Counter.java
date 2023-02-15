package vowel.counter;

public class Counter {

    public int getVowel(String str) {
        char[] array = str.toCharArray();
        int counter = 0;

        for(int i=0; i<= array.length - 1; i++) {
            if (array[i] == 'a' || array[i] == 'e' ||array[i] == 'i' ||array[i] == 'o' ||array[i] == 'u') {
                counter++;
            }
        }
        return counter;
    }
}
