package Arrays;

// Input = {1,2,4,5}
// Output = 3

public class MissingNumArray {
    public static void MissingNum(int [] arr){
         int n = arr.length+1;
         int ans = 0;
         int sum = (n*(n+1))/2;
         for(int i = 0;i < n-1;i++){
             ans += arr[i];
         }
         ans = sum - ans;
         System.out.print(ans);
    }
}
