package Arrays;

//Input: nums = [10,5,2,6], k = 100
//Output: 8

public class SubArrProductLessThanK {
    public static void numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1){
            System.out.print("0");
            return;
        }

        int left = 0;
        int count = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left++];
            }

            count += right - left + 1;
        }

        System.out.print(count);
    }
}
