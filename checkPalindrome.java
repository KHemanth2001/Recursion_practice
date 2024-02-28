public class checkPalindrome {
    public static void main(String[] args) {
        String str="abaaba";
        if(CheckPalindrome(str,0,str.length()-1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean CheckPalindrome(String str, int st,int end){
        if(st>=end){
            return true;
        }

        if(str.charAt(st)!=str.charAt(end)){
            return false;
        }else{
            return CheckPalindrome(str,st+1,end-1);
        }
    }
}
