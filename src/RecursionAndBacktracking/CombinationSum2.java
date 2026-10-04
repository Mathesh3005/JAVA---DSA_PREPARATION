package RecursionAndBacktracking;
import java.util.*;

//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]

public class CombinationSum2 {



        public static void combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);

            List<List<Integer>> ans = new ArrayList<>();
            dfs(candidates, target, 0, new ArrayList<>(), ans);

            System.out.print(ans);
        }

        private static void dfs(int[] a, int target, int start,
                         List<Integer> path, List<List<Integer>> ans) {

            if (target == 0) {
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int i = start; i < a.length; i++) {

                // Remove duplicate choices at the same level
                if (i > start && a[i] == a[i - 1])
                    continue;

                // Sorted array => remaining values are too large
                if (a[i] > target)
                    break;

                path.add(a[i]);

                dfs(a, target - a[i], i + 1, path, ans);

                path.remove(path.size() - 1);
            }
        }
    }

