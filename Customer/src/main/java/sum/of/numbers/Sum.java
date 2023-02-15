package sum.of.numbers;

public class Sum {

    public int GetSum(int a, int b) {
        if(a==b) return a;
        int sum = 0;
        int first = a;
        if(a < b) {
            while (first <= b) {
                sum += first;
                first = first + 1;
            }
            return sum;
        }
        int sum2 = 0;
        int second = a;
        while (second >= b) {
            sum2 += second;
            second = second - 1;
        }
        return sum2;
    }
}
