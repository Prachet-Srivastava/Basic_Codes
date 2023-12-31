import java.util.*;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-32,-21,-19,-11,-2,0,3,5,13,25,56,66,78,81};
        int target=25;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
        
    }

    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
    
}
