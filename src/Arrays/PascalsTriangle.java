package Arrays;
import java.util.*;

//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

public class PascalsTriangle {

        public static void  generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();

                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(ans.get(i - 1).get(j - 1)
                                + ans.get(i - 1).get(j));
                    }
                }

                ans.add(row);
            }

            System.out.print(ans);
        }
    }


