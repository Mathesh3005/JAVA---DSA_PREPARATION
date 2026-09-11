package Strings;
import java.util.*;

//Input: strs = ["flower","flow","flight"]
//Output: "fl

public class LongestCommonPrefix {
        // Returns the longest common prefix in an array of strings
        public static void longestCommonPrefix(String[] v) {
            // To store the result prefix
            StringBuilder ans = new StringBuilder();

            // Sort the array of strings
            Arrays.sort(v);

            // First string after sorting
            String first = v[0];

            // Last string after sorting
            String last = v[v.length - 1];

            // Compare characters of the first and last strings
            for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
                // Stop if characters are different
                if (first.charAt(i) != last.charAt(i)) {
                    System.out.print(ans.toString());
                    return;
                }

                // Add matching character to result
                ans.append(first.charAt(i));
            }

            // Return the final common prefix
            System.out.print(ans.toString());
        }
    }

