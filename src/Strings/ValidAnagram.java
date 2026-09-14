package Strings;

//Input: s = "anagram", t = "nagaram"
//
//Output: true

public class ValidAnagram {

        public static void isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                System.out.print("false");
                return;
            }

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    System.out.print("false");
                    return;
                }
            }

            System.out.print("true");
        }
    }

