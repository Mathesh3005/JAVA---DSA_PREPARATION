package Arrays;

// Input = {-2,-3,4,-1,-2,1,5,-3}
// Output = max Array = {4,-1,-2,1,5} , Sum = 7

public class MaxSubArraySum {
    public static void MaxSubArray(int [] arr){
        int sum = 0;
        int start = -1;
        int end = -1;
        int Ansstart = 0;
        int Ansend = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(sum == 0) start = i;
            sum += arr[i];
            if(sum > max){
                max = sum;
                Ansstart = start;
                Ansend = i;
            }
            if(sum < 0) sum = 0;
        }
        for(int i = Ansstart; i < Ansend+1; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Sum:"+max);
    }
}
