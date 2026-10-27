package Strings;

//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true

public class WordPattern {

        public static void wordPattern(String pattern, String s) {
            String[] words = s.split(" ");
            if (pattern.length() != words.length){
                System.out.print("false");
                return;
            }

            int[] charToWord = new int[26];
            java.util.HashMap<String, Integer> wordToChar = new java.util.HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                int c = pattern.charAt(i) - 'a';
                int w = i + 1;

                if (charToWord[c] != 0 && charToWord[c] != w) {
                    System.out.print("false");
                    return;
                }

                if (wordToChar.containsKey(words[i]) &&
                        wordToChar.get(words[i]) != c + 1) {
                    System.out.print("false");
                    return;
                }

                charToWord[c] = w;
                wordToChar.put(words[i], c + 1);
            }

            System.out.print("true");
        }
    }


