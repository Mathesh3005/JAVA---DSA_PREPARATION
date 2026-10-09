package RecursionAndBacktracking;

//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
//Output: true

public class WordSearch {

        public static boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;

            if (word.length() > m * n) {
                return false;
            }

            int[] freq = new int[128];

            for (char[] row : board) {
                for (char c : row) {
                    freq[c]++;
                }
            }

            // Prune impossible searches
            for (char c : word.toCharArray()) {
                if (--freq[c] < 0) {
                    return false;
                }
            }

            // Start from the rarer character
            if (freq[word.charAt(0)] > freq[word.charAt(word.length() - 1)]) {
                word = new StringBuilder(word).reverse().toString();
            }

            char[] target = word.toCharArray();

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dfs(board, target, i, j, 0)) {
                        return true;
                    }
                }
            }

            return false;
        }

        private static boolean dfs(char[][] board, char[] word,
                            int i, int j, int index) {

            if (board[i][j] != word[index]) {
                return false;
            }

            if (index == word.length - 1) {
                return true;
            }

            char temp = board[i][j];
            board[i][j] = '\0';

            boolean found = false;

            if (i > 0 && board[i - 1][j] != '\0') {
                found = dfs(board, word, i - 1, j, index + 1);
            }

            if (!found && i + 1 < board.length
                    && board[i + 1][j] != '\0') {
                found = dfs(board, word, i + 1, j, index + 1);
            }

            if (!found && j > 0 && board[i][j - 1] != '\0') {
                found = dfs(board, word, i, j - 1, index + 1);
            }

            if (!found && j + 1 < board[0].length
                    && board[i][j + 1] != '\0') {
                found = dfs(board, word, i, j + 1, index + 1);
            }

            board[i][j] = temp;

            return found;
        }
    }

