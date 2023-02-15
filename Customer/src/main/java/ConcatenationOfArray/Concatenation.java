package ConcatenationOfArray;

public class Concatenation {

    public int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;
        int[] ans = new int[size];

        System.arraycopy(nums, 0, ans,0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}