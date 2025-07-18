public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void mergeSort(int[] arr, int si, int ei) {
        int m = (si + ei) / 2;
        if (si == ei) {
            return;
        }

        mergeSort(arr, si, m);
        mergeSort(arr, m + 1, ei);
        merge(arr, si, m, ei);
    }

    static void merge(int[] arr, int si, int m, int ei) {

        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int t = si; t <= ei; t++) {
            arr[t] = temp[t - si];
        }
    }
}
