/**
 * Saperate Dgits from word
 */
public class SapDigFrmChar {
    public static void main(String[] args) {
        String word="2sf5as3ggfa4f3a";
        String num="";
        String letr="";
        
        for (int i = 0; i < word.length(); i++) {
            char a=word.charAt(i);
            if (Character.isDigit(a)) {
                num+=a;
            }else{
                letr+=a;
            }
        }System.out.println("letters are "+letr);
        System.out.println("digits are "+num);       
    }

}