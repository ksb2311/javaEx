public class Febonaci {
    public static void main(String[] args) {
        int num=10;
        int n1=0;
        int n2=1;
        int ans;
        for (int i = 1; i <=num; i++) {
            System.out.print(n1+" ");
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        //System.out.println(n);
    }
}