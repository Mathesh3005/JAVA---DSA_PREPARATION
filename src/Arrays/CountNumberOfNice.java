package Arrays;

// Input = {1,1,2,1,1}, k = 3
// Output = 2
public class CountNumberOfNice {
    public static void numberOfSubarrays(int[] nums, int k) {
        int ans = atMost(nums, k) - atMost(nums, k - 1);
        System.out.print(ans);

    }
    private static int atMost(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int result = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                count++;
            }
            while (count > k) {

                if (nums[left] % 2 != 0) {
                    count--;
                }
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }
}
