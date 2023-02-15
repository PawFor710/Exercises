package uglyNumber;


import java.util.List;

public class UglyNumber {

    // 2 * 2 = 4, 2 * 3 = 6, 2 * 5 = 10, 3 * 3 = 9, 3 * 5 = 15, 5 * 5 = 25, 1;

    public boolean isUgly(int n) {
        List<Integer> uglyNumbers = List.of(1, 4, 6, 9, 10, 15, 25);
        return uglyNumbers.contains(n);
    }
}
