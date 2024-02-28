public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr={10,20,70,30,10,40,50};
        int n=lastOccurance(arr,0,20);
        System.out.println(n);
    }
    public static int lastOccurance(int[] arr,int idx,int target){
        if(idx==arr.length){
            return -1;
        }
        int lastOcc=lastOccurance(arr,idx+1,target);
        if(lastOcc==-1){
            if(arr[idx]==target){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lastOcc;
        }

    }
}
