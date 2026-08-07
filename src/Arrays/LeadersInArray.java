package Arrays;

// Input = {1,2,3,2}
// Output = {3,2}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeadersInArray {
    public static void LeadersArray(int [] arr){
        ArrayList<Integer> a = new ArrayList<>();
        int max = 0;
        if(arr.length == 0){
            System.out.print(a);
            return;
        }
        max = arr[arr.length-1];
        a.add(arr[arr.length-1]);
        for(int i = arr.length-2 ; i >= 0 ; i--){
            if(arr[i] > max){
                a.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(a);
        for(int n : a){
            System.out.print(n+" ");
        }
    }
}
