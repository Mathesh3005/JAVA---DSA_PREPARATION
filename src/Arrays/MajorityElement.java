package Arrays;

// Input = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5}
// Output = 5

public class MajorityElement {
    public static void Majority(int [] arr){
        int cnt = 0;
        int e1 = 0;
        for(int i = 0;i < arr.length;i++){
            if(cnt == 0){
                cnt = 1;
                e1 = arr[i];
            }
            else if(e1 == arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i = 0;i < arr.length;i++){
            if(e1 == arr[i]){
                cnt1++;
            }
        }
        if(cnt1 > arr.length/2){
            System.out.print(e1);
        }
        else {
            System.out.print("-1");
        }
    }
}
