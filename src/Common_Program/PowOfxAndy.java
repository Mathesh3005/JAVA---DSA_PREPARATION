package Common_Program;

//Input: x = 2.00000, n = 10
//Output: 1024.00000

public class PowOfxAndy {

        public static void myPow(double x, int n) {
            long power = n;

            if (power < 0) {
                x = 1 / x;
                power = -power;
            }

            double result = 1.0;

            while (power > 0) {
                if ((power & 1) == 1) {
                    result *= x;
                }

                x *= x;
                power >>= 1;
            }

            System.out.print(result);
        }
    }

