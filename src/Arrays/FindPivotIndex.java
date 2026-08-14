package Arrays;

//Input: nums = [1,7,3,6,5,6]
//Output: 3

public class FindPivotIndex {
        public static void pivotIndex(int[] nums) {
            int total = 0;

            for (int num : nums) {
                total += num;
            }

            int left = 0;

            for (int i = 0; i < nums.length; i++) {
                if (left == total - left - nums[i]) {
                    System.out.print(i);
                    return;
                }
                left += nums[i];
            }

            System.out.print("-1");
        }
}

