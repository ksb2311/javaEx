import java.util.Arrays;

public class Prg {
    public static void main(String[] args) {
        String s = "sid@#r:;am";
        int size = s.length();
        char carr[] = s.toCharArray();
        char arr[] = new char[size];
        int i, j, k;
        for (i = 0, j = 0; i < size; i++) {
            if (Character.isLetter(carr[i])) {
                arr[j] = carr[i];
                j++;
            }
        }
        int len = j;
        for (j = 0, k = len - 1; j < size; j++) {
            if (Character.isLetter(carr[j])) {
                carr[j] = arr[k];
                k--;
            }
        }
        System.out.println("original String " + s);
        String rs = new String(carr);
        System.out.println(rs);

    }
}
