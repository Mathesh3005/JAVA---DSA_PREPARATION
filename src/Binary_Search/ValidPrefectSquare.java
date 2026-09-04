package Binary_Search;

//Input: num = 16
//Output: true

public class ValidPrefectSquare {

        public static void isPerfectSquare(int num) {
            if (num == 1) {
                System.out.print("true");
                return;
            }

            long left = 1;
            long right = num / 2;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                long square = mid * mid;

                if (square == num) {
                    System.out.print("true");
                    return;
                } else if (square < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.print("false");
        }
    }

