package RecursionAndBacktracking;
import java.util.*;

//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]

public class GenerateParentheses {

        public static List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<>();
            char[] path = new char[2 * n];

            backtrack(ans, path, 0, 0, 0, n);

            return ans;
        }

        private static void backtrack(List<String> ans, char[] path,
                               int pos, int open, int close, int n) {

            if (pos == 2 * n) {
                ans.add(new String(path));
                return;
            }

            if (open < n) {
                path[pos] = '(';
                backtrack(ans, path, pos + 1, open + 1, close, n);
            }

            if (close < open) {
                path[pos] = ')';
                backtrack(ans, path, pos + 1, open, close + 1, n);
            }
        }
    }

