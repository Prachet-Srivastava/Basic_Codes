import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7,3,6,2,1,8,4};
       // arr = mergeSort(arr);
        mergeSortInPlace(arr, 0 , arr.length-1);
        System.out.println(Arrays
        .toString(arr));


    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;

        }

        int mid = arr.length / 2;
        int [] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] fisrt, int[] second){
        int[] mix = new int[fisrt.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i< fisrt.length && j< second.length){
            if(fisrt[i] < second[j]){
                mix[k]=fisrt[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++; 
            }
            k++;
        }

        //it maybe possible that one of array is not complete
        while(i < fisrt.length){
            mix[k]=fisrt[i];
            i++;
            k++;
        }
        while( j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mergeSortInPlace(int[] arr , int s, int e){
        if(e-s == 1){
            return ;

        }

        int mid = arr.length / 2;
        
        mergeSortInPlace(arr,mid, e);
        mergeSortInPlace(arr,s, mid);
        

        mergeInPlace(arr, s, mid , e);
    }

    static void mergeInPlace(int[] arr,int s, int m, int e){
        int[] mix = new int[e-s];

        int i=s;
        int j=m;
        int k=0;

        while(i< m && j< e){
            if(arr[i] < arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++; 
            }
            k++;
        }

        //it maybe possible that one of array is not complete
        while(i < m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while( j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        
        for(int l=0; l< mix.length; l++){
            arr[s+l]= mix[l];
        }

    }
    
}
