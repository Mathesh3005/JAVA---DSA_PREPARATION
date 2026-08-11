package Arrays;
import java.util.*;

// Input = {-1,0,1,2,-1,-4}
// Output = [[-1, -1, 2], [-1, 0, 1]]
public class ThreeSum {
        public static void threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                if (nums[i] > 0) {
                    break;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum < 0) {
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left < right &&
                                nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right &&
                                nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
            }

            System.out.print(ans);
        }
}


