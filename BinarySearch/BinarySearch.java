public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(binarySearch(arr, 5));
    }

    static int binarySearch(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;
        while (si < ei) {
            int mid = si + (ei - si) / 2;
            if (target > arr[mid]) {
                si = mid - 1;
            } else if (target < arr[mid]) {
                ei = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
