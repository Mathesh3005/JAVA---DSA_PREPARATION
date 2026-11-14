package Common_Program;

//Input: dividend = 10, divisor = 3
//Output: 3

public class DivideTwoIntegers {

        public static void divide(int dividend, int divisor) {

            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                System.out.print(Integer.MAX_VALUE);
                return;
            }

            boolean negative = (dividend < 0) ^ (divisor < 0);

            long a = Math.abs((long) dividend);
            long b = Math.abs((long) divisor);

            long quotient = 0;

            for (int i = 31; i >= 0; i--) {

                if ((a >> i) >= b) {
                    a -= (b << i);
                    quotient |= (1L << i);
                }
            }

            System.out.print((int) (negative ? -quotient : quotient));
        }
    }


