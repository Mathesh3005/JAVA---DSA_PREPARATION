package Arrays;
import java.util.Arrays;

//Input: nums = [3,30,34,5,9]
//Output: "9534330"

public class LargestNumber {


        public static String largestNumber(int[] nums) {

            String[] arr = new String[nums.length];

            for (int i = 0; i < nums.length; i++) {
                arr[i] = Integer.toString(nums[i]);
            }

            Arrays.sort(arr, (a, b) -> {
                int lenA = a.length();
                int lenB = b.length();

                for (int i = 0; i < lenA + lenB; i++) {
                    char c1 = i < lenB ? b.charAt(i) : a.charAt(i - lenB);
                    char c2 = i < lenA ? a.charAt(i) : b.charAt(i - lenA);

                    if (c1 != c2) {
                        return c1 - c2;
                    }
                }

                return 0;
            });

            if (arr[0].equals("0")) {
                return "0";
            }

            StringBuilder sb = new StringBuilder();

            for (String s : arr) {
                sb.append(s);
            }

            return sb.toString();
        }
    }


