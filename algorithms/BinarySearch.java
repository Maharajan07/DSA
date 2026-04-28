public class BinarySearch {
    public static int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;

        boolean isAsc = arr[l] < arr[r];

        if (isAsc) {
            while (l <= r) {
                int mid = (l+r)/2;

                if(arr[mid] == target) 
                    return mid;
                else if (arr[mid] < target)
                    l = mid+1;
                else
                    r = mid-1;
            }
        }
        else {
            while (l <= r) {
            int mid = (l+r)/2;

                if(arr[mid] == target) 
                    return mid;
                else if (arr[mid] > target)
                    l = mid+1;
                else
                    r = mid-1;
            }
        }
        return -1;
    }

    public static int Recursive(int[] arr, int target, int l, int r) {
        if (l > r) return -1;

        int mid = (l+r)/2;

        boolean isAsc = arr[l] < arr[r];

        if (isAsc) {
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                return Recursive(arr, target, mid+1, r);
            else
                return Recursive(arr, target, l, mid-1);
        }
        else {
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                return Recursive(arr, target, mid+1, r);
            else
                return Recursive(arr, target, l, mid-1);
            }
    }

    public static int searchRecursive(int[] arr, int target) {
        return Recursive(arr, target, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 8, 12, 23};
        int[] brr = {12, 9, 6, 3, 1};

        System.out.println(search(arr, 6));
        System.out.println(search(brr, 1));

        System.out.println(searchRecursive(arr, 2));
        System.out.println(searchRecursive(brr, 9));
    }    
}
