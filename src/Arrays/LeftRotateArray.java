// Input = {1,2,3,4,5}
// Output = {2,3,4,5,1}

package Arrays;

public class LeftRotateArray {
    public static void LeftRotate(int[] arr){
        int temp = arr[0];
        for(int i = 1;i < arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int n : arr)
          System.out.print(n+" ");
    }
}


