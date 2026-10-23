package Arrays;

//Input: nums = [0,10], k = 2
//Output: 6
//Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.

public class SmallestRange1 {

        public static void smallestRangeI(int[] nums, int k) {
            int min = nums[0];
            int max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) min = nums[i];
                if (nums[i] > max) max = nums[i];
            }

            System.out.print(Math.max(0, max - min - 2 * k));
        }
    }


