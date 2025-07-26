public class Ceiling{
    public static void main(String[] args){
        int[] arr = { 1, 3, 6, 7, 12, 15, 18 };
        int ans = ceiling(arr, 9);
        System.out.println(arr[ans]);
    }
    static int ceiling(int[] arr, int target){
        int si = 0;
        int ei = arr.length -1;
        while(si<ei){
            int mid = si + (ei - si)/2;
            if(target< arr[mid]){
                ei = mid -1;
            }
            else if(target > arr[mid]){
                si = mid+1;
            }
            else{
                return mid;
            }
        }
        return si;
    }
}