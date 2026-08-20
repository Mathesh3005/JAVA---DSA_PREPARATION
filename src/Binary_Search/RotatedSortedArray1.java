package Binary_Search;

//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4

public class RotatedSortedArray1 {
        public static void search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            // Continue while there is still a valid search range
            while (low <= high) {

                // Calculate middle index
                int mid = (low + high) / 2;

                // If target found, return index
                if (nums[mid] == target) {
                    System.out.print(mid);
                    return;
                }

                // If left part is sorted
                if (nums[low] <= nums[mid]) {

                    // If target lies within sorted left part
                    if (nums[low] <= target && target < nums[mid]) {
                        high = mid - 1;
                    }
                    // Else, search in right half
                    else {
                        low = mid + 1;
                    }
                }

                // Else, right part is sorted
                else {

                    // If target lies within sorted right part
                    if (nums[mid] < target && target <= nums[high]) {
                        low = mid + 1;
                    }
                    // Else, search in left half
                    else {
                        high = mid - 1;
                    }
                }
            }
            System.out.print("-1");
        }
    }

