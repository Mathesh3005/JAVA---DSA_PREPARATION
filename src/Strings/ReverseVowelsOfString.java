package Strings;

//Input: s = "IceCreAm"
//
//Output: "AceCreIm"

public class ReverseVowelsOfString {

        public static void reverseVowels(String s) {
            char[] a = s.toCharArray();
            int l = 0, r = a.length - 1;

            while (l < r) {
                while (l < r && !vowel(a[l])) l++;
                while (l < r && !vowel(a[r])) r--;

                char temp = a[l];
                a[l++] = a[r];
                a[r--] = temp;
            }

            System.out.print(new String(a));
        }

        private static boolean vowel(char c) {
            switch (c) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    return true;
                default:
                    return false;
            }
        }
    }


