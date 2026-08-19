package Binary_Search;

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

public class FirstAndLastElement {
        public static void searchRange(int[] nums, int target) {
            int[] result = {-1, -1};
            int left = 0, right = nums.length - 1;

            // Find first occurrence
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= target) {
                    if (nums[mid] == target)
                        result[0] = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Find last occurrence
            left = 0;
            right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] <= target) {
                    if (nums[mid] == target)
                        result[1] = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            for(int results : result)
               System.out.print(results+" ");
        }
}

