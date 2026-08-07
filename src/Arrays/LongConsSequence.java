package Arrays;

// Input = {102,4,100,1,101,3,2,1,1}
// Output = 4

import java.util.HashSet;
import java.util.Set;

public class LongConsSequence {
    public static void LongestSequence(int [] arr){
        if(arr.length == 0){
            System.out.print("0");
            return;
        }
        int longest = 1;
        Set<Integer> s = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            s.add(arr[i]);
        }
        for(int it : s){
            if(!s.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(s.contains(x+1)){
                    x = x+1;
                    cnt+=1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        System.out.print(longest);
    }
}
