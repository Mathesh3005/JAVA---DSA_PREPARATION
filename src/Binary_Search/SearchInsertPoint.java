package Binary_Search;

//Input: nums = [1,3,5,6], target = 5
//Output: 2

public class SearchInsertPoint {
    public static void searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.print(ans);
    }
}
