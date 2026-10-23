package RecursionAndBacktracking;
import java.util.*;

//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

public class Permutation {

        public static void permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            solve(nums, 0, ans);
            System.out.print(ans);
        }

         static void solve(int[] nums, int idx, List<List<Integer>> ans) {
            if (idx == nums.length) {
                List<Integer> list = new ArrayList<>();
                for (int num : nums) {
                    list.add(num);
                }
                ans.add(list);
                return;
            }

            for (int i = idx; i < nums.length; i++) {
                swap(nums, idx, i);
                solve(nums, idx + 1, ans);
                swap(nums, idx, i);
            }
        }

        static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }


