package Arrays;

// Input = {0,1,2,0,1,2,1,2,0,0,0,1}
// Output = {0,0,0,0,0,1,1,1,1,2,2,2}

public class SortAnArray0s1s2s {
    public static void SortAnArray(int [] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                Swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                Swap(arr,mid,high);
                high--;
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
    public static void Swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
