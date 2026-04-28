import java.util.Arrays;

class LSearch {
    public static int find(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int find(String s, char target) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(String s, char target) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] find(int[][] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static boolean contains(int[][] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 3, 9};
        int target = 2;

        System.out.println(LSearch.find(arr, target));
        System.out.println(LSearch.contains(arr, target));

        String s = "Hello World";

        System.out.println(LSearch.find(s, 'o'));
        System.out.println(LSearch.contains(s, 'o'));

        int[][] arr2d = {
            {1, 3, 5},
            {4},
            {5, 8}
        };

        System.out.println(Arrays.toString(LSearch.find(arr2d, 4)));
        System.out.println(LSearch.contains(arr2d, 4));
    }
}
