package RecursionAndBacktracking;
import java.util.*;

//Input: nums = [1,2,2]
//Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

public class SubSet2 {

        public static void subsetsWithDup(int[] nums) {
            Arrays.sort(nums);

            List<List<Integer>> ans = new ArrayList<>(1 << nums.length);
            int[] path = new int[nums.length];

            dfs(nums, 0, 0, path, ans);

            System.out.print(ans);
        }

        private static void dfs(int[] nums, int index, int len,
                         int[] path, List<List<Integer>> ans) {

            ArrayList<Integer> subset = new ArrayList<>(len);

            for (int i = 0; i < len; i++) {
                subset.add(path[i]);
            }

            ans.add(subset);

            for (int i = index; i < nums.length; i++) {

                // Skip duplicate choices at the same level
                if (i > index && nums[i] == nums[i - 1]) {
                    continue;
                }

                path[len] = nums[i];

                dfs(nums, i + 1, len + 1, path, ans);
            }
        }
    }

