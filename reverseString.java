public class reverseString {
    public static void main(String[] args) {
        String str="hello";
        String st=reverseString(str);
        System.out.println(st);

    }
    public static String reverseString(String str){
        int i=0;
        int j=str.length()-1;
        char[] arr=str.toCharArray();
        reverseHelper(arr,i,j);
        return new String(arr);
    }
    public static void reverseHelper(char[] arr,int start,int end){
        if(start>=end){
            return;
        }
        char tem=arr[start];
        arr[start++]=arr[end];
        arr[end--]=tem;
        reverseHelper(arr,start,end);
    }
}
