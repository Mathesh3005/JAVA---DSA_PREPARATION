package Binary_Search;

//Input: nums = [1,2,1,3,5,6,4]
//Output: 5

public class FindPeakElement {
        public static void findPeakElement(int[] nums) {
            int low = 0, high = nums.length - 1;

            while (low < high) {
                // Find mid point
                int mid = (low + high) / 2;

                // If mid element is greater than next
                if (nums[mid] > nums[mid + 1]) {
                    // Move to left half
                    high = mid;
                } else {
                    // Move to right half
                    low = mid + 1;
                }
            }
            System.out.print(low);
        }
}

