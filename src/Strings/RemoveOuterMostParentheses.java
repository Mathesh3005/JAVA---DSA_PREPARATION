package Strings;

//Input: s = "(()())(())"
//Output: "()()()"

public class RemoveOuterMostParentheses {
        // Function to remove outer parentheses
        public static void removeOuterParentheses(String s) {
            // Initialize result string
            StringBuilder result = new StringBuilder();
            // Initialize nesting level counter
            int level = 0;

            // Traverse the string
            for (char ch : s.toCharArray()) {
                // If we encounter '(', increase the level
                if (ch == '(') {
                    // If we're inside a primitive, add '(' to result
                    if (level > 0) result.append(ch);
                    // Increase the nesting level for '('
                    level++;
                }
                // If we encounter ')', decrease the level
                else if (ch == ')') {
                    // Decrease the nesting level for ')'
                    level--;
                    // If we're inside a primitive, add ')' to result
                    if (level > 0) result.append(ch);
                }
            }
            System.out.print(result.toString());
        }
    }


