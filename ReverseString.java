public class ReverseString {
    public static void main(String[] args) {
        String str= "abcd";
        printRev(str.length()-1,str);
    }
    public static void printRev(int index, String str){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(index-1,str);
    }

    

    
}
