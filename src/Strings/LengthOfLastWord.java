package Strings;

//Input: s = "   fly me   to   the moon  "
//Output: 4

public class LengthOfLastWord {

        public static void lengthOfLastWord(String s) {
            int i = s.length() - 1;
            int len = 0;

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            while (i >= 0 && s.charAt(i) != ' ') {
                len++;
                i--;
            }

            System.out.print(len);
        }
    }


