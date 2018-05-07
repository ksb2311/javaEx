import java.util.ArrayList;
import java.util.Collection;
public class DiffBetArr {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("a");
        s1.add("d");
        s1.add("e");
        s1.add("f");
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("a");
        s2.add("b");
        s2.add("c");
        s2.add("d");

        s1.removeAll(s2);
        System.out.println(s1);
        
    }
}