public class Factorial{
    public static void main(String[] args) {
        int n=6;
        int f=1;
        for (int i = n; i > 0; i--) {
            f=f*i;
        }System.out.println(f);
    }
}