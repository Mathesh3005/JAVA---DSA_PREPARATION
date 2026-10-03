package RecursionAndBacktracking;
import java.util.*;

//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]

public class CombinationSum {

        public static void combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();

            backtrack(candidates, target, 0, new ArrayList<>(), result);

            System.out.print(result);
        }

        private static void backtrack(
                int[] candidates,
                int target,
                int start,
                List<Integer> current,
                List<List<Integer>> result) {

            // Base case: target reached
            if (target == 0) {
                result.add(new ArrayList<>(current));
                return;
            }

            // Try every candidate from 'start'
            for (int i = start; i < candidates.length; i++) {

                // Candidate is too large
                if (candidates[i] > target) {
                    continue;
                }

                // Choose
                current.add(candidates[i]);

                // i, NOT i + 1
                // because the same number can be reused
                backtrack(
                        candidates,
                        target - candidates[i],
                        i,
                        current,
                        result
                );

                // Undo choice
                current.remove(current.size() - 1);
            }
        }
    }

