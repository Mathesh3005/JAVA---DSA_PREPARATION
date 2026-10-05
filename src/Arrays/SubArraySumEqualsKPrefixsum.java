package Arrays;
import java.util.*;

// Input = {1,1,1}
// Output = 2

class SubArraySumEqualsKPrefixsum{
    public static void subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>(nums.length * 2);

        map.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            count += map.getOrDefault(prefixSum - k, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.print(count);
    }
}