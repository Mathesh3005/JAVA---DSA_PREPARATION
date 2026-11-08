package Arrays;
import java.util.Arrays;


//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]


public class MergeIntervels {

        public static void merge(int[][] intervals) {

            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

            int n = intervals.length;
            int[][] result = new int[n][2];

            int index = 0;

            int start = intervals[0][0];
            int end = intervals[0][1];

            for (int i = 1; i < n; i++) {

                if (intervals[i][0] <= end) {
                    end = Math.max(end, intervals[i][1]);
                }
                else {
                    result[index][0] = start;
                    result[index][1] = end;
                    index++;

                    start = intervals[i][0];
                    end = intervals[i][1];
                }
            }

            result[index][0] = start;
            result[index][1] = end;
            index++;

            System.out.print(Arrays.copyOf(result, index));
        }
    }


