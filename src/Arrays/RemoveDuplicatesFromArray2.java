package Arrays;

//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]

public class RemoveDuplicatesFromArray2 {

        public static void removeDuplicates(int[] nums) {
            int n = nums.length;
            if (n <= 2){
                System.out.print(n);
                return;
            }
            int k = 2;

            for (int i = 2; i < n; i++) {
                if (nums[i] != nums[k - 2]) {
                    nums[k++] = nums[i];
                }
            }

            System.out.print(k);
        }
    }

