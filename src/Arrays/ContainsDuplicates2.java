package Arrays;
import java.util.*;

//Input: nums = [1,2,3,1], k = 3
//Output: true

public class ContainsDuplicates2 {

        public static void containsNearbyDuplicate(int[] nums, int k) {
            HashSet<Integer> set = new HashSet<>(k + 1);

            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i])) {
                    System.out.print("true");
                    return;
                }

                if (i >= k) {
                    set.remove(nums[i - k]);
                }
            }

            System.out.print("false");
        }
}


