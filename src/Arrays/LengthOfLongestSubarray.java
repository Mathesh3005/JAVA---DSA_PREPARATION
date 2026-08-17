package Arrays;
import java.util.HashMap;

//Input: nums = [1,2,3,1,2,3,1,2], k = 2
//Output: 6

public class LengthOfLongestSubarray {

        public static void maxSubarrayLength(int[] nums, int k) {
            HashMap<Integer, Integer> freq = new HashMap<>();

            int left = 0;
            int max = 0;

            for (int right = 0; right < nums.length; right++) {
                int value = nums[right];
                int count = freq.getOrDefault(value, 0) + 1;
                freq.put(value, count);

                if (count > k) {
                    while (nums[left] != value) {
                        freq.put(nums[left], freq.get(nums[left]) - 1);
                        left++;
                    }

                    freq.put(value, freq.get(value) - 1);
                    left++;
                }

                int length = right - left + 1;
                if (length > max) {
                    max = length;
                }
            }

             System.out.print(max);
        }
}

