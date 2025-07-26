public class AscDescBS{
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(ascDescBS(arr, 5));
        int[] nums = {8,7,6,5,4,3};
        System.out.println(ascDescBS(nums, 7));
    }

    static int ascDescBS(int[] arr, int target){
        int si = 0;
        int ei = arr.length - 1;
        boolean isAsc = arr[si] < arr[ei];
        while(si<ei){
            int mid = si + (ei - si) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if (target > arr[mid]) {
                si = mid - 1;
                } else{
                ei = mid + 1;
                }
            }
            else{
                if (target < arr[mid]) {
                si = mid - 1;
                } else{
                ei = mid + 1;
                }   
            }
            
        }
        return -1;
    }
}