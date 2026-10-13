package Common_Program;

//Input: n = 10
//Output: 4

public class CountPrimes {

        public static void countPrimes(int n) {
            if (n <= 2){
                System.out.print("0");
                return;
            }

            int size = (n - 2) / 2;
            boolean[] composite = new boolean[size];

            int limit = (int) Math.sqrt(n - 1);

            for (int i = 0; 2 * i + 3 <= limit; i++) {
                if (!composite[i]) {
                    int p = 2 * i + 3;
                    int start = (p * p - 3) / 2;

                    for (int j = start; j < size; j += p) {
                        composite[j] = true;
                    }
                }
            }

            int count = 1; // Prime number 2

            for (int i = 0; i < size; i++) {
                if (!composite[i]) {
                    count++;
                }
            }

            System.out.print(count);
        }
    }


