package Arrays;
import java.util.*;

//Input: nums = [23,2,4,6,7], k = 6
//Output: true

public class ContinuousSubarraySum {
        public static void checkSubarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                int rem = sum % k;
                if (map.containsKey(rem)) {
                    if (i - map.get(rem) >= 2) {
                        System.out.print("true");
                        return;
                    }
                } else {
                    map.put(rem, i);
                }
            }
            System.out.print(false);
        }
}

