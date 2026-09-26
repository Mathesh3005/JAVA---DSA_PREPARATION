package Strings;

//Input: s = "level"
//Output: "l"

public class LongestHappyPrefix {

        public static void longestPrefix(String s) {
            int n = s.length();

            int[] lps = new int[n];

            int length = 0;
            int index = 1;
            while (index < n) {
                if (s.charAt(index) == s.charAt(length)) {
                    length++;
                    lps[index] = length;
                    index++;
                }

                else if (length > 0) {
                    length = lps[length - 1];
                }

                else {
                    lps[index] = 0;
                    index++;
                }
            }
            System.out.print(s.substring(0, lps[n - 1]));
        }
    }

