/**
 * Rev10to1dec
 */
public class Rev10to1dec {
    static int row=4;
    static int n=10;
    public static void main(String[] args) {
        for (int i = 0; i < row; i++) {
            for (int j = row-1; j >= i; j--){
                System.out.print((n)+" ");
                n--;
            }System.out.println();
        }
    }
}