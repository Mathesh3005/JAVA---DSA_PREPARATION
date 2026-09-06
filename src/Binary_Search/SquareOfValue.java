package Binary_Search;

//Input: x = 4
//Output: 2

public class SquareOfValue {

        public static void mySqrt(int x) {
            if (x < 2) {
                System.out.print(x);
                return;
            }

            int left = 1;
            int right = x / 2;
            int ans = 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (mid <= x / mid) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.print(ans);
        }
    }

