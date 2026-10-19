package Arrays;
import java.util.*;

//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]

public class FindAllNumbersDisappear {

        public static void findDisappearedNumbers(int[] nums) {
            int n = nums.length;

            for (int x : nums) {
                int idx = (x < 0 ? -x : x) - 1;
                if (nums[idx] > 0) {
                    nums[idx] = -nums[idx];
                }
            }

            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0) ans.add(i + 1);
            }
            System.out.print(ans);
        }
}


