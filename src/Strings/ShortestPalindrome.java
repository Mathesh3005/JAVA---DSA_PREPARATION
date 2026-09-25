package Strings;

//Input: s = "aacecaaa"
//Output: "aaacecaaa"

public class ShortestPalindrome {

        public static void shortestPalindrome(String s) {
            int n = s.length();
            if (n < 2){
                System.out.print(s);
                return;
            }

            // Build: s + "#" + reverse(s)
            char[] a = new char[2 * n + 1];
            s.getChars(0, n, a, 0);

            a[n] = '#';

            for (int i = 0; i < n; i++) {
                a[n + 1 + i] = s.charAt(n - 1 - i);
            }

            // KMP LPS
            int[] lps = new int[a.length];

            for (int i = 1, len = 0; i < a.length; ) {
                if (a[i] == a[len]) {
                    lps[i++] = ++len;
                } else if (len > 0) {
                    len = lps[len - 1];
                } else {
                    i++;
                }
            }

            int prefix = lps[a.length - 1];
            int add = n - prefix;

            StringBuilder result = new StringBuilder(n + add);

            // Add reverse of the non-palindromic suffix
            for (int i = n - 1; i >= prefix; i--) {
                result.append(s.charAt(i));
            }

            result.append(s);

            System.out.print(result.toString());
        }
    }

