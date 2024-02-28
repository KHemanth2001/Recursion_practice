import java.util.ArrayList;
public class allIndexOccurance {
    public static void main(String[] args) {
        int[] arr={10,20,70,30,10,40,50};
        int[] n=printAllIndxs(arr,0,80,0);
        for(int val:n){
            System.out.println(val);
        }
    }
    public static int[] printAllIndxs(int[] arr,int idx,int target,int fsf){
        if(idx==arr.length){
            return new int[fsf];
        }
        if(arr[idx]==target){
            int[] iarr=printAllIndxs(arr,idx+1,target,fsf+1);
            iarr[fsf]=idx;
            return iarr;
        }else {
            int[] iarr = printAllIndxs(arr, idx + 1, target, fsf);
            return iarr;
        }

    }
}
