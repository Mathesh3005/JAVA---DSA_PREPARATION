package Binary_Search;

//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]

public class IntersectionOfTwoArray2 {
        public static void intersect(int[] nums1, int[] nums2) {
            int[] count = new int[1001];

            // Count elements in nums1
            for (int num : nums1) {
                count[num]++;
            }

            // Store intersection
            int[] result = new int[Math.min(nums1.length, nums2.length)];
            int k = 0;

            for (int num : nums2) {
                if (count[num] > 0) {
                    result[k++] = num;
                    count[num]--;
                }
            }

            // Return only the required portion
            int[] ans = new int[k];
            System.arraycopy(result, 0, ans, 0, k);

            for(int val : ans)
                System.out.print(val+" ");
        }
    }

