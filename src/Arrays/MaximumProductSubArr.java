package Arrays;

// Input = {2,3,-2,4}
// Output = 6

public class MaximumProductSubArr {
    public static void MaxProSubArr(int [] arr){
        int n = arr.length;
        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n-i-1];
            ans = Math.max(ans,Math.max(pre,suff));
        }
        System.out.print(ans);
    }
}
