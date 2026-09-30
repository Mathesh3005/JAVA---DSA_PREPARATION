package RecursionAndBacktracking;
import java.util.*;

//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

public class SubSets {

        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            backtrack(nums, 0, new ArrayList<>(), result);

            return result;
        }

        private static void backtrack(int[] nums, int index,
                               List<Integer> current,
                               List<List<Integer>> result) {

            // Add current subset
            result.add(new ArrayList<>(current));

            // Try including each remaining element
            for (int i = index; i < nums.length; i++) {
                current.add(nums[i]);

                backtrack(nums, i + 1, current, result);

                // Backtrack
                current.remove(current.size() - 1);
            }
        }
    }

