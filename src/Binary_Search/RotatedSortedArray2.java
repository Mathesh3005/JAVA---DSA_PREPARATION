package Binary_Search;

//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true

public class RotatedSortedArray2 {
        public static void search(int[] nums, int k) {
            int low = 0, high = nums.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                // If mid element is the target
                if (nums[mid] == k) {
                    System.out.print("true");
                    return;
                }

                // Handle duplicates: cannot determine sorted side
                if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                    low++;
                    high--;
                    continue;
                }

                // Left half is sorted
                if (nums[low] <= nums[mid]) {
                    if (nums[low] <= k && k <= nums[mid]) {
                        high = mid - 1; // Search left
                    } else {
                        low = mid + 1;  // Search right
                    }
                }
                // Right half is sorted
                else {
                    if (nums[mid] <= k && k <= nums[high]) {
                        low = mid + 1;  // Search right
                    } else {
                        high = mid - 1; // Search left
                    }
                }
            }

            System.out.print("false");
        }
    }

