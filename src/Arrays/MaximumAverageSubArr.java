package Arrays;

//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000

public class MaximumAverageSubArr {
    public static void findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        int r =k-1;
        int l =0;
        while(r < nums.length-1){
            sum = sum - nums[l];
            l++;
            r++;
            sum = sum + nums[r];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.print((double) maxSum / k);
    }
}
