public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={10,20,70,30,10,40,50};
        BubbleSort(arr,arr.length-1);
        for(int val:arr){
            System.out.println(val);
        }
    }
    public static void BubbleSort(int[] arr, int size){
        if(size==0 || size==1){
            return;
        }
        for(int i=0;i<size;i++){
            if(arr[i]>arr[i+1]){
                int tem=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tem;
            }
        }
        BubbleSort(arr,size-1);
    }
}
