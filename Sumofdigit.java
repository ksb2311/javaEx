public class Sumofdigit{
    public static void main(String[] args) {
        int n=124;
        int ans=0;
        while (n!=0) {
            ans+=(n%10);
            n=n/10;
        }System.out.println(ans);
    }
}