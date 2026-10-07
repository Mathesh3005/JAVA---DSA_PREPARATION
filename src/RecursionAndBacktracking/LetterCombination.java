package RecursionAndBacktracking;
import java.util.*;

//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

public class LetterCombination {

        public static void letterCombinations(String digits) {

            List<String> result = new ArrayList<>();

            if (digits == null || digits.length() == 0) {
                System.out.print(result);
                return;
            }

            String[] map = {
                    "", "", "abc", "def",
                    "ghi", "jkl", "mno",
                    "pqrs", "tuv", "wxyz"
            };

            backtrack(digits, 0, new StringBuilder(), result, map);

            System.out.print(result);
        }

        private static void backtrack(String digits, int index,
                               StringBuilder current,
                               List<String> result,
                               String[] map) {

            // All digits processed
            if (index == digits.length()) {
                result.add(current.toString());
                return;
            }

            String letters = map[digits.charAt(index) - '0'];

            for (char ch : letters.toCharArray()) {

                current.append(ch);

                backtrack(digits, index + 1, current, result, map);

                current.deleteCharAt(current.length() - 1);
            }
        }
    }

