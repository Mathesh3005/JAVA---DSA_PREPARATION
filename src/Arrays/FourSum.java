package Arrays;
import java.util.*;

//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

public class FourSum {

        public static void fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;

            if (n < 4){
                System.out.print(res);
                return;
            }

            Arrays.sort(nums);

            for (int i = 0; i < n - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                long min1 = (long) nums[i] + nums[i + 1]
                        + nums[i + 2] + nums[i + 3];
                if (min1 > target) break;

                long max1 = (long) nums[i] + nums[n - 1]
                        + nums[n - 2] + nums[n - 3];
                if (max1 < target) continue;

                for (int j = i + 1; j < n - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                    long min2 = (long) nums[i] + nums[j]
                            + nums[j + 1] + nums[j + 2];
                    if (min2 > target) break;

                    long max2 = (long) nums[i] + nums[j]
                            + nums[n - 1] + nums[n - 2];
                    if (max2 < target) continue;

                    int l = j + 1, r = n - 1;

                    while (l < r) {
                        long sum = (long) nums[i] + nums[j]
                                + nums[l] + nums[r];

                        if (sum < target) {
                            l++;
                        } else if (sum > target) {
                            r--;
                        } else {
                            res.add(Arrays.asList(
                                    nums[i], nums[j], nums[l], nums[r]
                            ));

                            int lv = nums[l], rv = nums[r];

                            while (l < r && nums[l] == lv) l++;
                            while (l < r && nums[r] == rv) r--;
                        }
                    }
                }
            }

            System.out.print(res);
        }
    }


