package Arrays;

// Input = {3,1,-2,-5,2,-4}
// Output = {3,-2,1,-5,2,-4}

import java.util.ArrayList;

public class RearrangeArrEleBySign {
    public static void ArrangeBySign(int [] arr){
        int [] ans = new int[arr.length];
        int posIndex = 0;
        int NegIndex = 1;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < 0){
                ans[NegIndex] = arr[i];
                NegIndex+=2;
            }
            else{
                ans[posIndex] = arr[i];
                posIndex+=2;
            }
        }
        for(int a : ans)
            System.out.print(a+" ");
    }
}
