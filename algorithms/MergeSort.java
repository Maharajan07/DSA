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

        for (int itr=0; itr<arr.length; itr++) {
            arr[itr] = crr[itr];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 0, 2, 4, 6};
        int mid = arr.length/2;
        sort(arr, 0, mid, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
