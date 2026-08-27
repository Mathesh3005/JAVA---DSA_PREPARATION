package Binary_Search;

//Input: arr = [2,3,4,7,11], k = 5
//Output: 9

public class KthMissingPositiveNumber {
        public static void findKthPositive(int[] vec, int k) {
            int low = 0, high = vec.length - 1;

            // Binary search loop
            while (low <= high) {
                int mid = (low + high) / 2;

                // Number of missing elements before index mid
                int missing = vec[mid] - (mid + 1);

                if (missing < k) {
                    low = mid + 1;  // Move right
                } else {
                    high = mid - 1; // Move left
                }
            }

            // Final result after binary search
            System.out.print(k + high + 1);
        }
}

