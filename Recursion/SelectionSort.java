public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        selectionSort(arr, arr.length, 0, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selectionSort(int[] arr, int row, int col, int maxIndex) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[maxIndex]) {
                maxIndex = col;
                selectionSort(arr, row, col + 1, maxIndex);
            } else {
                selectionSort(arr, row, col + 1, maxIndex);
            }
        } else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row - 1];
            arr[row - 1] = temp;
            selectionSort(arr, row - 1, 0, 0);
        }
    }
}
