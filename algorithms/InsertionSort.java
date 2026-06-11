import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int temp = arr[i];
            for (int j=i-1; j>=0; j--) {
                if (arr[j] > temp) {
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                } else 
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 7, 8};
        int[] brr = { 9, 7, 5, 3, 1};
        sort(arr);
        sort(brr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}

// Time Complexity: O(n^2) in worst and average cases, O(n) in best case (when the array is already sorted)
// Space Complexity: O(1)