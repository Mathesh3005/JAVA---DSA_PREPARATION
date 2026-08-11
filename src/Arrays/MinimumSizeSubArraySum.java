package Arrays;

//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2

public class MinimumSizeSubArraySum {
    public static void minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }
        System.out.print(minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}
