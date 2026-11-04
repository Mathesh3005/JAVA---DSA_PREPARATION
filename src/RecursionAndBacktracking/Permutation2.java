package RecursionAndBacktracking;
import java.util.*;

//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

public class Permutation2 {

        public static void permuteUnique(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            backtrack(nums, 0, result);

            System.out.print(result);
        }

        private static void backtrack(int[] nums, int start,
                               List<List<Integer>> result) {

            if (start == nums.length) {
                List<Integer> list = new ArrayList<>(nums.length);

                for (int num : nums) {
                    list.add(num);
                }

                result.add(list);
                return;
            }

            for (int i = start; i < nums.length; i++) {

                boolean duplicate = false;

                for (int j = start; j < i; j++) {
                    if (nums[j] == nums[i]) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) continue;

                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;

                backtrack(nums, start + 1, result);

                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
            }
        }
    }


