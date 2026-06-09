import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            int minIdx = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 8, 11};
        int[] brr = {9, 6, 4, 2, 0};
        sort(arr);
        sort(brr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}

// Time Complexity: O(n^2) in all cases
// Space Complexity: O(1)