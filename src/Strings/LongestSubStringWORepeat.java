package Strings;

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

public class LongestSubStringWORepeat {

        public static void lengthOfLongestSubstring(String s) {
            int[] index = new int[128];
            int left = 0, max = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                left = Math.max(left, index[c]);

                int len = right - left + 1;
                if (len > max) max = len;

                index[c] = right + 1;
            }

            System.out.print(max);
        }
    }


