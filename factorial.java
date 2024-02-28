public class factorial {
    public static void main(String[] args) {
        int n=Fac(3);
        System.out.println(n);
    }
    public static int Fac(int n){
        if(n==0){
            return 1;
        }
        return n*Fac(n-1);
    }
}
