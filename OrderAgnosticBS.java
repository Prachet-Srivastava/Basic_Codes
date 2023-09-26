import java.util.*;
//when we don't know wheather the array is sorted in ascending order or descending order
public class OrderAgnosticBS{
    public static void main(String[] args) {
        int[] arr={32,21,19,11,2,0,-3,-5,-13,-25,-56,-66,-78,-81};
        int target=0;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
        
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //find wheather the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];


        while(start<=end){
            //int mid=(start+end)/2
            //if start + end exceeds the range of integer
            int mid=start + (end- start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{ 
                    start=mid+1;
                }    
            }
            
        }
        return -1;
    }
}
