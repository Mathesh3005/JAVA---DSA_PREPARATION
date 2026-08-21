package Binary_Search;

//Input: nums = [3,4,5,1,2]
//Output: 1

public class MinimumInRotatedSortedArray {
        public static void findMin(int[] nums) {
            int low = 0, high = nums.length - 1;
            // Binary search loop
            while (low < high) {
                // Calculate mid index
                int mid = low + (high - low) / 2;

                // Check which half to discard
                if (nums[mid] > nums[high]) {
                    // Minimum lies in right half
                    low = mid + 1;

                } else {
                    // Minimum lies in left half (including mid)
                    high = mid;
                }
            }

            // Return the minimum element
            System.out.print(nums[low]);

        }
    }

