package Arrays;

//Input = {1,2,3,4,5,6,7}
//Output = {4,5,6,7,1,2,3}

public class LeftRotateByDPlace {
    public static void RotateByD(int[] arr,int k){
        int n = arr.length;
        Reverse(arr,0,n-1); //{7,6,5,4,3,2,1}
        Reverse(arr,0,k-1); //{5,6,7,4,3,2,1}
        Reverse(arr,k,n-1); //{5,6,7,1,2,3,4}
        for(int s : arr){
            System.out.print(s+" ");
        }
    }
    public static void Reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
