package RecursionAndBacktracking;
import java.util.*;

//Input: num = "123", target = 6
//Output: ["1*2*3","1+2+3"]

public class ExpressionAddOperator {

        public static List<String> addOperators(String num, int target) {
            List<String> ans = new ArrayList<>();
            char[] s = num.toCharArray();
            char[] path = new char[2 * s.length];
            dfs(s, target, 0, 0L, 0L, 0, path, ans);
            return ans;
        }

        private static void dfs(char[] s, long target, int pos,
                         long value, long prev, int len,
                         char[] path, List<String> ans) {

            if (pos == s.length) {
                if (value == target)
                    ans.add(new String(path, 0, len));
                return;
            }

            long n = 0;
            int start = pos;

            for (int i = pos; i < s.length; i++) {
                if (i > start && s[start] == '0') break;

                n = n * 10 + s[i] - '0';
                int digits = i - start + 1;
                System.arraycopy(s, start, path, len + (pos == 0 ? 0 : 1), digits);

                int nextLen = len + digits;

                if (pos == 0) {
                    dfs(s, target, i + 1, n, n, nextLen, path, ans);
                } else {
                    path[len] = '+';
                    System.arraycopy(s, start, path, len + 1, digits);
                    dfs(s, target, i + 1, value + n, n,
                            len + digits + 1, path, ans);

                    path[len] = '-';
                    dfs(s, target, i + 1, value - n, -n,
                            len + digits + 1, path, ans);

                    path[len] = '*';
                    dfs(s, target, i + 1, value - prev + prev * n,
                            prev * n, len + digits + 1, path, ans);
                }
            }
        }
    }

