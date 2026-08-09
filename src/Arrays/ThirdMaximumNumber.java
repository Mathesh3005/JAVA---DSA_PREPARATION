package Arrays;

// Input: nums = [3,2,1]
// Output: 1

public class ThirdMaximumNumber {
    public static void ThirdMaximum(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {


            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }


        if (third == Long.MIN_VALUE) {
            System.out.print((int) first);
        } else {
            System.out.print((int) third);
        }
    }
}
