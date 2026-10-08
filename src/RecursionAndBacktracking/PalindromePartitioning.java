package RecursionAndBacktracking;
import java.util.*;

//Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]

public class PalindromePartitioning {

        static List<List<String>> ans = new ArrayList<>();
        static List<String> path = new ArrayList<>();
        static boolean[][] pal;
        static char[] a;

        public static void partition(String s) {
            a = s.toCharArray();
            int n = a.length;

            pal = new boolean[n][n];

            // Precompute palindromes
            for (int i = n - 1; i >= 0; i--) {
                pal[i][i] = true;

                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j] && (j - i == 1 || pal[i + 1][j - 1])) {
                        pal[i][j] = true;
                    }
                }
            }

            dfs(0);
            System.out.print(ans);
        }

        private static void dfs(int start) {

            if (start == a.length) {
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int end = start; end < a.length; end++) {

                if (!pal[start][end])
                    continue;

                path.add(new String(a, start, end - start + 1));

                dfs(end + 1);

                path.remove(path.size() - 1);
            }
        }
    }

