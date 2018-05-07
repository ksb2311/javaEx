public class Swap2var{
    public static void main(String[] args) {
        //swapipng 2 no without using any third variable
        int a=23;
        int b=43;
        System.out.println("a "+a);
        System.out.println("b "+b);

        //using normal addition subtraction
        // a=a+b;
        // b=a-b;
        // a=a-b;

        //using bitwise operator
        a=a^b;
        b=a^b;
        a=a^b;
        
        System.out.println("after swap");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}