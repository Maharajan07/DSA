import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            boolean swap = false;
            for (int j=0; j<n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                return;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 0, 1};
        int[] brr = {1, 3, 5, 9, 12};
        sort(arr);
        sort(brr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}

// Time Complexity: O(n^2) in worst and average case, O(n) in best case (when the array is already sorted)
// Space Complexity: O(1)