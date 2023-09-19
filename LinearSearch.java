public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={23,544,755,73,12,53,42,78,94,3};
        int target=12;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
        ans=linearSearch3(nums,target);
        System.out.println(ans);
        boolean ans1=linearSearch2(nums,target);
        System.out.println(ans1);
        
    }
    //search in the Array
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            int element =arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    static int linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return false;
        }

        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
