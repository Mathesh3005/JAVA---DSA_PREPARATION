package Strings;

//Input: num = "52"
//Output: "5"

public class LargestOddNumberInString {
        public static void largestOddNumber(String s) {
            int ind = -1;

            // Find the last odd digit in the string
            int i;
            for (i = s.length() - 1; i >= 0; i--) {
                if ((s.charAt(i) - '0') % 2 == 1) {
                    ind = i;
                    break;
                }
            }

            // Return empty string if no odd digit was found
            if (ind == -1) {
                System.out.print(" ");
                return;
            }
            // Skip leading zeroes up to the odd digit
            i = 0;
            while (i <= ind && s.charAt(i) == '0') i++;

            // Return substring from first non-zero to odd digit
            System.out.print(s.substring(i, ind + 1));
        }
    }

