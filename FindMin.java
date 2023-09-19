public class FindMin {
    public static void main(String[] args) {
        int[] arr={23,544,755,73,12,53,42,78,94,3};
        System.out.println("minimum number is "+min(arr));
    }

    //assume arr.length!=0
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
