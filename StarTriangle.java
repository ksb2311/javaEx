public class StarTriangle {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }

    }