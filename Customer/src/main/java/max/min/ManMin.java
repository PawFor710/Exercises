package max.min;

import java.util.Arrays;

public class ManMin {
    public int binarySearch(int[] array, int find) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int index = left + (right-left)/2;
            if (array[index] == find) {
                return index;
            }
            if (array[index] > find) {
                right = index - 1;
            } else if (array[index] < find) {
                left = index + 1;
            }
        }
        return -1;
    }
}
