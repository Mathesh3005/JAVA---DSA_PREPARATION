package Strings;

//Input: s = "tree"
//Output: "eert"

public class SortCharactersByFrequency {

        public static void frequencySort(String s) {
            int[] freq = new int[128];

            // Count
            for (char c : s.toCharArray()) {
                freq[c]++;
            }

            // Sort characters by frequency
            char[] chars = new char[62];
            int k = 0;

            for (char c = '0'; c <= '9'; c++) {
                if (freq[c] > 0) chars[k++] = c;
            }
            for (char c = 'A'; c <= 'Z'; c++) {
                if (freq[c] > 0) chars[k++] = c;
            }
            for (char c = 'a'; c <= 'z'; c++) {
                if (freq[c] > 0) chars[k++] = c;
            }

            // Selection sort — at most 62 characters
            for (int i = 0; i < k - 1; i++) {
                int max = i;

                for (int j = i + 1; j < k; j++) {
                    if (freq[chars[j]] > freq[chars[max]]) {
                        max = j;
                    }
                }

                char temp = chars[i];
                chars[i] = chars[max];
                chars[max] = temp;
            }

            // Build answer
            StringBuilder ans = new StringBuilder(s.length());

            for (int i = 0; i < k; i++) {
                char c = chars[i];

                for (int j = 0; j < freq[c]; j++) {
                    ans.append(c);
                }
            }

            System.out.print(ans.toString());
        }
    }

