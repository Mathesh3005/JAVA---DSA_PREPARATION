package Binary_Search;

//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
//Output: true

public class Search2DMatrix2 {

        public static void searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;        // Number of rows
            int m = matrix[0].length;     // Number of columns

            int row = 0;           // Start at first row
            int col = m - 1;       // Start at last column (top-right)

            // Traverse while within matrix bounds
            while (row < n && col >= 0) {
                if (matrix[row][col] == target) {
                    System.out.print("true");
                    return;  // Found target
                } else if (matrix[row][col] < target) {
                    row++; // Move down
                } else {
                    col--; // Move left
                }
            }

            System.out.print("false");
        }
    }

