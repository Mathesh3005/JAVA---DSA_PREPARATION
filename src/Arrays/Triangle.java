package Arrays;
import java.util.*;

//Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//Output: 11
//Explanation: The triangle looks like:
//   2
//  3 4
// 6 5 7
//4 1 8 3
//The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).

public class Triangle {

        public static void minimumTotal(List<List<Integer>> triangle) {

            int n = triangle.size();

            int[] dp = new int[n + 1];

            for (int i = n - 1; i >= 0; i--) {

                for (int j = 0; j <= i; j++) {

                    dp[j] = triangle.get(i).get(j)
                            + Math.min(dp[j], dp[j + 1]);
                }
            }

            System.out.print(dp[0]);
        }
    }


