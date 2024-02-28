public class powOfNumInLog {
    public static void main(String[] args) {
        int n=Pow(5,3);
        System.out.println(n);
    }
    public static int Pow(int n,int p){
        if(p==1){
            return n;
        }else if(p%2!=0){
            return n*Pow(n,p/2)*Pow(n,p/2);
        }else{
            return Pow(n,p/2)*Pow(n,p/2);
        }
    }
}
