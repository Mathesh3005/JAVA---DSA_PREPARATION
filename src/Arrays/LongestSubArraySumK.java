package Arrays;

// Input = {1,2,3,1,1,1,1}
// Output = 3

public class LongestSubArraySumK {
    public static void LongestArray(int [] arr,int target){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxi = 0;
        int n = arr.length;
        while(right < n){
            while(left <= right && sum > target){
                sum -= arr[left];
                left++;
            }
            if(sum == target){
                maxi = Math.max(maxi,right-left+1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        System.out.print(maxi);
    }
}
