package two.sum;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = new int[3];

        nums[0] = 3;
        nums[1] = 3;


        int target = 6;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int n = 0; n < nums.length; n++) {
                if (nums[i] + nums[n] == target && n!=i) {
                    index1 = n;
                    index2 = i;
                }
            }
        }

        int indexes[] = new int[2];

        indexes[0] = index2;
        indexes[1] = index1;

        for (Integer indexArray : indexes) {
            System.out.println(indexArray);
        }
    }
}
