package Binary_Search;

//Input: nums = [7,2,5,10,8], k = 2
//Output: 18

public class SplitArrayLargestSum {

        private static int countPartitions(int[] a, int maxSum) {
            int partitions = 1;
            int currentSum = 0;

            for (int num : a) {
                if (currentSum + num > maxSum) {
                    partitions++;
                    currentSum = num;
                } else {
                    currentSum += num;
                }
            }

            return partitions;
        }

        public static void splitArray(int[] a, int k) {
            int low = 0;
            int high = 0;

            // Find max element and total sum in one pass
            for (int num : a) {
                low = Math.max(low, num);
                high += num;
            }

            // Binary search for minimum possible largest sum
            while (low < high) {
                int mid = low + (high - low) / 2;

                if (countPartitions(a, mid) > k) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            System.out.print(low);
        }
}


