package Strings;

//Input: n = 4
//Output: "1211"

public class CountAndSay {

        private static String buildNextTerm(String currentTerm) {

            StringBuilder nextTerm = new StringBuilder();
            int index = 0;

            while (index < currentTerm.length()) {
                char digit = currentTerm.charAt(index);
                int count = 0;

                while (index < currentTerm.length()
                        && currentTerm.charAt(index) == digit) {
                    count++;
                    index++;
                }

                nextTerm.append(count).append(digit);
            }

            return nextTerm.toString();
        }

        public static String countAndSay(int n) {
            if (n == 1) {
                return "1";
            }
            String previousTerm = countAndSay(n - 1);
            return buildNextTerm(previousTerm);
        }
    }



