package Common_Program;

//Input: n = 16
//Output: true
//Explanation: 24 = 16

public class PowerOfTwo {

        public static void isPowerOfTwo(int n) {
            if (n <= 0){
                System.out.print("false");
                return;
            }

            while (n % 2 == 0) {
                n = n / 2;
            }

            System.out.print(n == 1);
        }
    }


