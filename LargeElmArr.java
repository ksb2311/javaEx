public class LargeElmArr{
    public static void main(String[] args) {
//finding smallest and largest no with index
        int[] a={12,32,21,5,57,29};
        int b=0;
        int small=a[0];
        int index1=0;
        int index2=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i]>a[j]) {
                    b=a[i];
                    index1=i;      
                }
                if (a[i]<small) {
                    small=a[i];
                    index2=i;      
                }
            }
        }System.out.println("large no "+b+" index is "+index1);
        System.out.println("smallest no "+small+" index is "+index2);
    }
}