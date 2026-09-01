package Binary_Search;

//Input: mat = [[1,4],[3,2]]
//Output: [0,1]

public class FindAPeakElement2 {

        public static void findPeakGrid(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;

            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Find the maximum element in the middle column
                int maxRow = 0;

                for (int i = 1; i < m; i++) {
                    if (mat[i][mid] > mat[maxRow][mid]) {
                        maxRow = i;
                    }
                }

                // Get left and right neighbors
                int current = mat[maxRow][mid];
                int leftValue = (mid > 0) ? mat[maxRow][mid - 1] : -1;
                int rightValue = (mid < n - 1) ? mat[maxRow][mid + 1] : -1;

                // Peak found
                if (current > leftValue && current > rightValue) {
                    System.out.print(maxRow+" "+mid);
                    return;
                }

                // Move toward the larger neighbor
                if (leftValue > current) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.print("-1, -1");
        }
    }



