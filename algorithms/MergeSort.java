import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] arr, int[] brr) {
        int al = arr.length;
        int bl = brr.length;
        int[] crr = new int[al+bl];
        int i=0, j=0, k=0;

        while (i<al && j<bl) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            }
            else {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }

        while (i<al) {
            crr[k] = arr[i];
            i++;
            k++;
        }

        while (j<bl) {
            crr[k] = brr[j];
            j++;
            k++;
        }

        return crr;
    } 
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 9};
        int[] brr = {1, 3, 4, 5 ,8};

        System.out.println(Arrays.toString(sort(arr, brr)));
    }
}
