package Binary_Search;

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true

public class Search2DMatrix {
        public static void searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;

            int left = 0;
            int right = m * n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Convert 1D index to 2D coordinates
                int row = mid / n;
                int col = mid % n;

                if (matrix[row][col] == target) {
                    System.out.print("true");
                    return;
                } else if (matrix[row][col] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.print("false");
        }
    }

