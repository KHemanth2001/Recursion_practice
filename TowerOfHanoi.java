public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3,"A","B","C");
    }
    public static void TOH(int n, String source, String helper, String dest){
        if(n==0){
            return;
        }
        TOH(n-1,source,dest,helper);
        System.out.println("Moved disk from disk "+source+" to "+dest);
        TOH(n-1,helper,source,dest);
    }
}
