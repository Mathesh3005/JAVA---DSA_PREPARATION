package Strings;

//Input: num1 = "2", num2 = "3"
//Output: "6"

public class MultiplyString {

        public static void multiply(String num1, String num2) {
            int n = num1.length();
            int m = num2.length();

            if (num1.charAt(0) == '0' || num2.charAt(0) == '0') {
                System.out.print("0");
                return;
            }

            int[] res = new int[n + m];

            for (int i = n - 1; i >= 0; i--) {
                int a = num1.charAt(i) - '0';

                for (int j = m - 1; j >= 0; j--) {
                    int sum = a * (num2.charAt(j) - '0') + res[i + j + 1];

                    res[i + j + 1] = sum % 10;
                    res[i + j] += sum / 10;
                }
            }

            char[] ans = new char[n + m];
            int k = 0, i = 0;

            while (i < res.length && res[i] == 0)
                i++;

            while (i < res.length)
                ans[k++] = (char) (res[i++] + '0');

            System.out.print(new String(ans, 0, k));
        }
    }


