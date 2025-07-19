public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void quickSort(int[] arr, int low, int high) {
        // low and high first and last index of the array
        if (low >= high) {
            return;
        }
        int si = low;
        int ei = high;
        int mid = (si + ei) / 2;
        int pivot = arr[mid]; // Choosing the middle element as pivot
        // Partitioning the array around the pivot

        while (si <= ei) {
            // Increment si until we find an element greater than or equal to the pivot
            // Decrement ei until we find an element less than or equal to the pivot
            while (arr[si] < pivot) {
                si++;
            }
            while (arr[ei] > pivot) {
                ei--;
            }
            // here the si is greater than or equal to the pivot and ei is less than or
            // equal to the pivot
            // If si is less than or equal to ei, swap the elements at si and ei
            if (si <= ei) {
                int temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                si++;
                ei--;
            }
        }
        // Recursively sort the two halves
        // After partitioning, si is the index of the first element greater than the
        // pivot
        // and ei is the index of the last element less than the pivot
        // So we can recursively sort the left and right parts of the array
        quickSort(arr, low, ei);
        quickSort(arr, si, high);
    }
}

// Recursion Relation: T(n) = (left part) + (Right Part)) + (putting the pivot
// in place)
// Recurrence Relation: T(n) = T(k)+ T(n-k-1) + O(n)
// Worst Case: O(n^2) when the pivot is the smallest or largest element
// Average Case: O(n log n)
// Best Case: O(n log n) when the pivot divides the array into two equal halves
// (similar to merge sort)
// Space Complexity: O(log n) due to recursive stack space
// In-place sorting algorithm: Yes, it sorts the array in place without using extra space
// Stable sorting algorithm: No, it does not maintain the relative order of equal elements
// Better than Merge Sort: Yes, it is generally faster than merge sort for small to medium-sized arrays