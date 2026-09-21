package Strings;

//Input: s = "())"
//Output: 1

public class MinimumAddToMakeParenthesesValid {

        public static void minAddToMakeValid(String s) {
            int open = 0;
            int ans = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    open++;
                } else {
                    if (open > 0) {
                        open--;
                    } else {
                        ans++;
                    }
                }
            }

            System.out.print(ans + open);
        }
    }

