package Binary_Search;

//Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
//Output: 3

public class MinimumNoOfDaysToMakeBouquets {

        private static boolean isPossible(int[] bloomDays, int day, int m, int k) {
            int flowers = 0;
            int bouquets = 0;

            for (int bloom : bloomDays) {
                if (bloom <= day) {
                    flowers++;
                    if (flowers == k) {
                        bouquets++;
                        // Early exit
                        if (bouquets == m) {
                            return true;
                        }
                        flowers = 0;
                    }
                } else {
                    flowers = 0;
                }
            }
            return false;
        }

        public static void minDays(int[] bloomDays, int m, int k) {

            // Avoid integer overflow
            if ((long) m * k > bloomDays.length) {
                System.out.print("-1");
                return;
            }

            int low = bloomDays[0];
            int high = bloomDays[0];

            // Find minimum and maximum bloom day
            for (int i = 1; i < bloomDays.length; i++) {
                if (bloomDays[i] < low) {
                    low = bloomDays[i];
                }
                if (bloomDays[i] > high) {
                    high = bloomDays[i];
                }
            }

            // Binary search
            while (low < high) {
                int mid = low + (high - low) / 2;

                if (isPossible(bloomDays, mid, m, k)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            System.out.print(low);
        }
}

