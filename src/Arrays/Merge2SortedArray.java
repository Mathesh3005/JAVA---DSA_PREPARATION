package Arrays;

// Input = nums1 = {1,3,5,0,0,0} , nums2 = {2,4,6}
// Output = {1,2,3,4,5,6}

public class Merge2SortedArray {

        public static void merge(int[] nums1, int[] nums2) {
            int m =3,n=3;
            int i = m - 1;
            int j = n - 1;

            int k = m + n - 1;
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
            for(int a : nums1)
                System.out.print(a+" ");
        }
}




