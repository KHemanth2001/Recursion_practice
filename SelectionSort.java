public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={100,10,20,70,30,10,40,50};
        selectionSort(arr,arr.length-1);
        for(int val:arr){
            System.out.println(val);
        }

    }
    public static void selectionSort(int[] arr,int size){
        if(size==0 || size==1){
            return;
        }
        int j=size;
        for(int i=0;i<size;i++){
            if(arr[i]>arr[i+1]){
                if(arr[i]>arr[j]){
                    j=i;
                }
            }
        }
        int t=arr[j];
        arr[j]=arr[size];
        arr[size]=t;
        selectionSort(arr,size-1);
    }
}
