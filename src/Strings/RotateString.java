package Strings;

//Input: s = "abcde", goal = "cdeab"
//Output: true

public class RotateString {

        public static void rotateString(String s, String goal) {
            int n = s.length();

            if (n != goal.length()) {
                System.out.print("false");
                return;
            }

            for (int shift = 0; shift < n; shift++) {
                boolean match = true;

                for (int i = 0; i < n; i++) {
                    if (s.charAt((shift + i) % n) != goal.charAt(i)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    System.out.print("true");
                    return;
                }
            }

            System.out.print("false");
        }
    }

