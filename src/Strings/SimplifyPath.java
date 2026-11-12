package Strings;

//Input: path = "/home//foo/"
//Output: "/home/foo"

public class SimplifyPath {

        public static void simplifyPath(String path) {

            int n = path.length();
            String[] stack = new String[n / 2 + 1];
            int top = 0;

            int i = 0;

            while (i < n) {

                // Skip consecutive slashes
                while (i < n && path.charAt(i) == '/') {
                    i++;
                }

                if (i == n) break;

                int start = i;

                // Read directory name
                while (i < n && path.charAt(i) != '/') {
                    i++;
                }

                int len = i - start;

                // Current directory
                if (len == 1 && path.charAt(start) == '.') {
                    continue;
                }

                // Parent directory
                if (len == 2 &&
                        path.charAt(start) == '.' &&
                        path.charAt(start + 1) == '.') {

                    if (top > 0) {
                        top--;
                    }

                } else {
                    // Store valid directory
                    stack[top++] = path.substring(start, i);
                }
            }

            if (top == 0){
                System.out.print("/");
                return;
            }

            StringBuilder result = new StringBuilder(n);

            for (int j = 0; j < top; j++) {
                result.append('/');
                result.append(stack[j]);
            }

            System.out.print(result.toString());
        }
    }


