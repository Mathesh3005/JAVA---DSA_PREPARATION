package Arrays;

// Input = {1,1,0,0,1,0,1,1,0}
// Output = {1,1,1,1,1,0,0,0,0}

public class MoveAllZerosEnd {
    public static void MoveZeros(int [] arr){
        int j =-1;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1;i < arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
