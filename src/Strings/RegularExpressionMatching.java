package Strings;

//Input: s = "aa", p = "a*"
//Output: true

public class RegularExpressionMatching {

        public static void isMatch(String s, String p) {

            int m = s.length();
            int n = p.length();

            boolean[] dp = new boolean[n + 1];
            dp[0] = true;

            for (int j = 2; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[j] = dp[j - 2];
                }
            }

            for (int i = 1; i <= m; i++) {

                boolean prev = dp[0];
                dp[0] = false;

                for (int j = 1; j <= n; j++) {

                    boolean temp = dp[j];

                    char sc = s.charAt(i - 1);
                    char pc = p.charAt(j - 1);

                    if (pc == '.' || pc == sc) {
                        dp[j] = prev;
                    }

                    else if (pc == '*') {

                        dp[j] = dp[j - 2];

                        char before = p.charAt(j - 2);

                        if (before == '.' || before == sc) {
                            dp[j] = dp[j] || temp;
                        }
                    }

                    else {
                        dp[j] = false;
                    }

                    prev = temp;
                }
            }

            System.out.print(dp[n]);
        }
    }


