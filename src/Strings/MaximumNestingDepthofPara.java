package Strings;

//Input: s = "(1+(2*3)+((8)/4))+1"
//
//Output: 3

public class MaximumNestingDepthofPara {

        public static void maxDepth(String s) {
            int p = 0;
            int ans = 0;
            for (char ch : s.toCharArray()) {
                // Increase depth on open parenthesis
                if (ch == '(') p++;
                    // Decrease depth on close parenthesis
                else if (ch == ')') p--;
                // Update maximum depth encountered
                ans = Math.max(ans, p);
            }
            System.out.print(ans);
        }
    }

