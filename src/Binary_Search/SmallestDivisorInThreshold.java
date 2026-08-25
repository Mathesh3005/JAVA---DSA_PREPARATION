package Binary_Search;

//Input: nums = [1,2,5,9], threshold = 6
//Output: 5

public class SmallestDivisorInThreshold {
        private  static int sumByD(int[] arr, int div) {
            int sum = 0;

            for (int num : arr) {
                sum += (num + div - 1) / div;  // ceil(num / div)
            }

            return sum;
        }

        public static void smallestDivisor(int[] arr, int limit) {

            if (arr.length > limit){
                System.out.print("-1");
                return;
            }

            int low = 1;
            int high = 0;

            for (int num : arr) {
                high = Math.max(high, num);
            }

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (sumByD(arr, mid) <= limit) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.print(low);
        }
    }

