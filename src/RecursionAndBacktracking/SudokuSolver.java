package RecursionAndBacktracking;

//Input: board = [["5","3",".",".","7",".",".",".","."],
            // ["6",".",".","1","9","5",".",".","."],
            // [".","9","8",".",".",".",".","6","."],
            // ["8",".",".",".","6",".",".",".","3"],
            // ["4",".",".","8",".","3",".",".","1"],
            // ["7",".",".",".","2",".",".",".","6"],
            // [".","6",".",".",".",".","2","8","."],
            // [".",".",".","4","1","9",".",".","5"],
            // [".",".",".",".","8",".",".","7","9"]]

//Output: [["5","3","4","6","7","8","9","1","2"],
        // ["6","7","2","1","9","5","3","4","8"],
        // ["1","9","8","3","4","2","5","6","7"],
        // ["8","5","9","7","6","1","4","2","3"],
        // ["4","2","6","8","5","3","7","9","1"],
        // ["7","1","3","9","2","4","8","5","6"],
        // ["9","6","1","5","3","7","2","8","4"],
        // ["2","8","7","4","1","9","6","3","5"],
        // ["3","4","5","2","8","6","1","7","9"]]

public class SudokuSolver {

    static int[] row = new int[9];
    static int[] col = new int[9];
    static int[] box = new int[9];

    static int[] emptyR = new int[81];
    static int[] emptyC = new int[81];
    static int count = 0;

        public static void solveSudoku(char[][] board) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        emptyR[count] = i;
                        emptyC[count++] = j;
                    } else {
                        int bit = 1 << (board[i][j] - '1');
                        row[i] |= bit;
                        col[j] |= bit;
                        box[(i / 3) * 3 + j / 3] |= bit;
                    }
                }
            }

            solve(board, 0);
        }

        private static boolean solve(char[][] board, int pos) {
            if (pos == count) return true;

            int best = pos;
            int min = 10;

            for (int k = pos; k < count; k++) {
                int r = emptyR[k], c = emptyC[k];
                int b = (r / 3) * 3 + c / 3;

                int candidates = ~(row[r] | col[c] | box[b]) & 511;
                int bits = Integer.bitCount(candidates);

                if (bits < min) {
                    min = bits;
                    best = k;
                    if (bits <= 1) break;
                }
            }

            if (min == 0) return false;

            swap(pos, best);

            int r = emptyR[pos], c = emptyC[pos];
            int b = (r / 3) * 3 + c / 3;
            int candidates = ~(row[r] | col[c] | box[b]) & 511;

            while (candidates != 0) {
                int bit = candidates & -candidates;
                candidates -= bit;

                board[r][c] = (char) ('1' + Integer.numberOfTrailingZeros(bit));

                row[r] |= bit;
                col[c] |= bit;
                box[b] |= bit;

                if (solve(board, pos + 1)) return true;

                row[r] ^= bit;
                col[c] ^= bit;
                box[b] ^= bit;
            }

            board[r][c] = '.';
            swap(pos, best);
            return false;
        }

        private static void swap(int i, int j) {
            int t = emptyR[i];
            emptyR[i] = emptyR[j];
            emptyR[j] = t;

            t = emptyC[i];
            emptyC[i] = emptyC[j];
            emptyC[j] = t;
        }
    }


