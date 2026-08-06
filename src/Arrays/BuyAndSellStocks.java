package Arrays;

// Input = {7,1,5,3,6,4}
// Output = 5

public class BuyAndSellStocks {
    public static void BuyAndSell(int [] arr){
        int min = arr[0];
        int maxprofit = 0;
        for(int i = 0;i < arr.length;i++){
            int cost =  arr[i] - min;
            maxprofit = Math.max(maxprofit,cost);
            min = Math.min(min,arr[i]);
        }
        System.out.print(maxprofit);
    }
}
