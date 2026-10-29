package Arrays;

//Input: nums = [3,4,-1,1]
//Output: 2

public class FirstMissingPositive {

        public static void firstMissingPositive(int[] nums) {
            int n = nums.length;
            int i = 0;

            while (i < n) {
                int correct = nums[i] - 1;

                if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
            }

            for (i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    System.out.print(i + 1);
                    return;
                }
            }

            System.out.print(n + 1);
        }
    }


