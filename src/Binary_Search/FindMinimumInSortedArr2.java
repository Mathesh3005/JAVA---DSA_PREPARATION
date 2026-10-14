package Binary_Search;

//Input: nums = [1,3,5]
//Output: 1

public class FindMinimumInSortedArr2 {

        public static void findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] < nums[right]) {
                    right = mid;
                } else if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else {
                    right--;
                }
            }

            System.out.print(nums[left]);
        }
    }


