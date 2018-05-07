public class RevStrSpCharTest {
    public static void main(String[] args) {
        String s = "sid@#r:;am";
        int len = s.length();
        char ch[] = s.toCharArray();
        char ar[] = new char[len];
        char tmp[]=new char[len];
        for (int i = 0; i < len; i++) {
            if (Character.isAlphabetic(ch[i])) {
                    ar[i] = ch[i];
            }
        }
        for (int i = len-1; i > 0; i--) {
            for (int j = 0; j < len; j++) {
                tmp[j]=ar[i];
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(ch[i])) {
                ar[i] = ch[i];
            }
        }
        System.out.println(ar);
    }
}