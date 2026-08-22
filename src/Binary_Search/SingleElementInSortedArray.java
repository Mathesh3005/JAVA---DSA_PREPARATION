package Binary_Search;

//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2

public class SingleElementInSortedArray {
        public static void singleNonDuplicate(int[] arr) {
            int n = arr.length;

            // Edge case: only one element in the array
            if (n == 1){
                System.out.print(arr[0]);
                return;
            }

            // Edge case: first element is the unique one
            if (arr[0] != arr[1]){
                 System.out.print(arr[0]);
                 return;
            }

            // Edge case: last element is the unique one
            if (arr[n - 1] != arr[n - 2]){
                System.out.print(arr[n - 1]);
                return;
            }

            // Initialize binary search bounds (exclude first and last index)
            int low = 1, high = n - 2;

            // Perform binary search
            while (low <= high) {
                // Calculate middle index
                int mid = (low + high) / 2;

                // Check if middle element is the unique one
                if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                    System.out.print(arr[mid]);
                    return;
                }

                // If mid is in the left half (pairing is valid)
                if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                        (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                    // Move to the right half
                    low = mid + 1;
                }
                // If mid is in the right half (pairing broken earlier)
                else {
                    // Move to the left half
                    high = mid - 1;
                }
            }

            // Dummy return (not reachable if input is valid)
            System.out.print("-1");
        }
    }

