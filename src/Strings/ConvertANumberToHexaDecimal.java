package Strings;

//Input: num = 26
//Output: "1a"

public class ConvertANumberToHexaDecimal {

        public static void toHex(int num) {

            if (num == 0) {
                System.out.print("0");
                return;
            }

            char[] hex = "0123456789abcdef".toCharArray();

            StringBuilder result = new StringBuilder();

            while (num != 0) {

                int remainder = num & 15;

                result.append(hex[remainder]);

                num = num >>> 4;
            }

            System.out.print(result.reverse().toString());
        }
    }


