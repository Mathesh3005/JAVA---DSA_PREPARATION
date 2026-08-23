package Binary_Search;

//Input: piles = [3,6,7,11], h = 8
//Output: 4

public class KoKoEatingBananas {
        private static long calculateTotalHours(int[] piles, int speed) {
            long totalH = 0;

            for (int bananas : piles) {
                totalH += (bananas - 1L) / speed + 1;

                // Early stopping
                if (totalH > Integer.MAX_VALUE) {
                    return totalH;
                }
            }

            return totalH;
        }

        public static void minEatingSpeed(int[] piles, int h) {

            int maxPile = 0;

            for (int pile : piles) {
                maxPile = Math.max(maxPile, pile);
            }

            int low = 1;
            int high = maxPile;
            int ans = maxPile;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                long totalH = calculateTotalHours(piles, mid);

                if (totalH <= h) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.print(ans);
        }
    }

