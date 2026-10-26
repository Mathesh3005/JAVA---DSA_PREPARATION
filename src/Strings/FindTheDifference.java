package Strings;

//Input: s = "abcd", t = "abcde"
//Output: "e"

public class FindTheDifference {

        public static void findTheDifference(String s, String t) {
            char ans = 0;

            for (char c : s.toCharArray()) {
                ans ^= c;
            }

            for (char c : t.toCharArray()) {
                ans ^= c;
            }

            System.out.print(ans);
        }
    }


