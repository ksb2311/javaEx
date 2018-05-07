import java.util.Arrays;

class StringReverse {
    void reverseString(String s, int n) {
        char c[] = s.toCharArray();
        char a[] = new char[n];
        int i, j, k;
        for (i = 0, j = 0; i < n; i++) {
            if (Character.isLetter(c[i])) {
                a[j] = c[i];
                j++;
            }
        }
        int len = j;
        for (j = 0, k = len - 1; j < n; j++) {
            if (Character.isLetter(c[j])) {
                c[j] = a[k];
                k--;
            }
        }
        System.out.println("Original String: " + s);
        String revStr = new String(c);
        System.out.println("Reverse String: " + revStr);
    }

    public static void main(String args[]) {
        StringReverse str = new StringReverse();
        String s = "a!!!b.c.d,e'f,ghi";
        int size = s.length();
        // System.out.println("length: "+size);
        str.reverseString(s, size);
    }
}