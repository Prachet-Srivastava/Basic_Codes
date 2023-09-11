public class RotatedArrayWithDuplicateBS {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivotwwithDuplicate(arr));
        
    }
    static int search(int[] nums,int target){
        int pivot=findPivotwwithDuplicate(nums);
        //if you don't find yhe pivot ,it means array is not rotated
        if(pivot==-1){
            //just do nomal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        //if pivot is found ,you have found two asc sorted arrays

        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return binarySearch(nums, target, 0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int findPivotwwithDuplicate(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            
            //if elements  at miiddle,, start, end, are equals just skip the duplicates
            if(arr[mid]== arr[start] && arr[mid]==arr[end]){
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }

                end--;
            }
            else if(arr[start]< arr[mid] || (arr[mid]>arr[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target,int start,int end){
        // int start=0;
        // int end=arr.length-1;

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
