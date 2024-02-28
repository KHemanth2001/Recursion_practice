public class maxOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,70,30,40,50};
        int n=MaxOfArray(arr,0);
        System.out.println(n);
    }
    public static int MaxOfArray(int[] arr, int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int n=arr[i];
        return (n>MaxOfArray(arr,i+1))? n:MaxOfArray(arr,i+1);
    }
}
