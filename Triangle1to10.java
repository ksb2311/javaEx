public class Triangle1to10{
    public static void main(String[] args) {
        int num=4;
        int n=0;
        for (int i = 0; i < num; i++) {
            for (int j = num-1; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((n+1)+" ");
                n++;
            }
            System.out.println();
        }
    }
}