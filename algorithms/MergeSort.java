import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr, int start,int mid, int end) {
        int l = arr.length;
        int[] crr = new int[l];
        int i=start, j=mid, k=start;

        while (i<mid && j<end) {
            if (arr[i] < arr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            }
            else {
                crr[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i<mid) {
            crr[k] = arr[i];
            i++;
            k++;
        }

        while (j<end) {
            crr[k] = arr[j];
            j++;
            k++;
        }

        for (int itr=start; itr<end; itr++) {
            arr[itr] = crr[itr];
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) 
            return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        sort(arr, start, mid, end);
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 0, 9, 6};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
