public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=ceiling(arr,target);
        System.out.println(ans);
        
    }
    //smallest number greater then target element
    static int ceiling(int[] arr, int target){
        //but what if the target element is largest then the greatest number in array
        if(target>arr[arr.length-1]){
            return -1;
        } 
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //int mid=(start+end)/2
            //if start + end exceeds the range of integer
            int mid=start + (end- start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return arr[start];
    }
}
