package Arrays;

// Input = {1,1,0,1,1,1,0,1,1}
// Output = 3
public class MaximumConsecutiveOnce {
    public static void MaximunOnce(int [] arr){
        int count = 0;
        int maxi = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else{
                count = 0;
            }
        }
        System.out.print(maxi);
    }
}
