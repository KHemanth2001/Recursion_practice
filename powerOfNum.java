public class powerOfNum {
    public static void main(String[] args) {
        int n=Pow(10,2);
        System.out.println(n);
    }
    public static int Pow(int n,int p){
        if(p==1){
            return n;
        }
        return n*Pow(n,p-1);
    }
}
