package Strings;

//Input: a = "abcd", b = "cdabcdab"
//Output: 3

public class ValidStringMatch {

        public static void repeatedStringMatch(String a, String b) {
            int n = a.length();
            int m = b.length();

            // If b is longer, minimum required repetitions
            int repeats = (m + n - 1) / n;

            // Check repeats and repeats + 1
            if (contains(a, b, repeats)) {
                System.out.print(repeats);
                return;
            }

            if (contains(a, b, repeats + 1)) {
                System.out.print(repeats + 1);
                return;
            }

            System.out.print("-1");
        }

        private static boolean contains(String a, String b, int repeats) {
            int[] lps = buildLPS(b);
            int j = 0;
            int totalLength = repeats * a.length();

            for (int i = 0; i < totalLength; i++) {
                char c = a.charAt(i % a.length());

                while (j > 0 && c != b.charAt(j)) {
                    j = lps[j - 1];
                }

                if (c == b.charAt(j)) {
                    j++;
                }

                if (j == b.length()) {
                    return true;
                }
            }

            return false;
        }

        private static int[] buildLPS(String b) {
            int[] lps = new int[b.length()];

            for (int i = 1, len = 0; i < b.length();) {
                if (b.charAt(i) == b.charAt(len)) {
                    lps[i++] = ++len;
                } else if (len > 0) {
                    len = lps[len - 1];
                } else {
                    i++;
                }
            }

            return lps;
        }
    }

