package Arrays;

//Input: nums = [4,2,4,5,6]
//Output: 17

public class MaximumErasureValue {
        public static void maximumUniqueSubarray(int[] nums) {

            int n = nums.length;
            int[] last = new int[10001];
            int[] prefix = new int[n + 1];
            int left = 0;
            int max = 0;
            for (int right = 0; right < n; right++) {

                int num = nums[right];

                prefix[right + 1] = prefix[right] + num;

                left = Math.max(left, last[num]);

                int currentSum = prefix[right + 1] - prefix[left];

                max = Math.max(max, currentSum);

                last[num] = right + 1;
            }
            System.out.print(max);
        }
}

