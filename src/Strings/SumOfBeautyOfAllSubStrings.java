package Strings;

//Input: s = "aabcb"
//Output: 5

public class SumOfBeautyOfAllSubStrings {

        public static void beautySum(String s) {
            int n = s.length();
            int ans = 0;

            for (int i = 0; i < n; i++) {
                int[] freq = new int[26];
                int[] count = new int[n + 1];

                int max = 0;

                for (int j = i; j < n; j++) {
                    int c = s.charAt(j) - 'a';

                    if (freq[c] > 0) {
                        count[freq[c]]--;
                    }

                    freq[c]++;
                    count[freq[c]]++;

                    max = Math.max(max, freq[c]);

                    int min = 1;
                    while (count[min] == 0) {
                        min++;
                    }

                    ans += max - min;
                }
            }

            System.out.print(ans);
        }
    }

