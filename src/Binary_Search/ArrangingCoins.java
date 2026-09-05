package Binary_Search;

//Input: n = 5
//Output: 2

public class ArrangingCoins {

        public static void arrangeCoins(int n) {
            long left = 0;
            long right = n;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                long coins = mid * (mid + 1) / 2;

                if (coins == n) {
                    System.out.print((int) mid);
                    return;
                } else if (coins < n) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            int ans = (int) right;
            System.out.print(ans);
        }
    }

