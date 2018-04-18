package Arrays;

public class first {
    public static void main(String[] args) {
        int x= 0;
        int[] chetArray = new int[20];
        for (int i = 2; i  <= chetArray.length; i=i+2) {
            chetArray[x]= i;
            x+=x;
            System.out.print(" " + chetArray[x]);
            }


    }
}