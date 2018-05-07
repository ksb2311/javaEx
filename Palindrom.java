public class Palindrom{
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("madam");
        String a1=a.toString();
        StringBuffer b=new StringBuffer(a.reverse());
        String b1=b.toString();
        System.out.println(a1);
        System.out.println(b1);
        if (a1.equals(b1)) {
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
        
    }
}