package RecursionAndBacktracking;
import java.util.*;

//Input: k = 3, n = 7
//Output: [[1,2,4]]

public class CombinationSum3 {

        public static void combinationSum3(int k, int n) {
            List<List<Integer>> result = new ArrayList<>();

            backtrack(1, k, n, new ArrayList<>(), result);

            System.out.print(result);
        }

        private static void backtrack(int start, int k, int target,
                               List<Integer> current,
                               List<List<Integer>> result) {

            // Valid combination found
            if (current.size() == k) {
                if (target == 0) {
                    result.add(new ArrayList<>(current));
                }
                return;
            }

            // Try numbers from start to 9
            for (int num = start; num <= 9; num++) {

                // No need to continue if number is already too large
                if (num > target) {
                    break;
                }

                current.add(num);

                // Move to num + 1 to avoid reusing the same number
                backtrack(num + 1, k, target - num, current, result);

                // Backtrack
                current.remove(current.size() - 1);
            }
        }
    }

