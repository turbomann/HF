package GShildt.Chapter_5;

public class Bubble_test {
    public static void main(String[] args) {

        String ABC[] = {"One", "Two", "Four", "Tree"};
        String newString = "";
        int a, b, x;
        int size = ABC.length;
        System.out.println("Current Array ");
        for (int i = 0; i < size; i++)
            System.out.print(ABC[i]);
        System.out.println("\n################");


        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (ABC[b - 1].compareTo(ABC[b]) > 0) {

                    newString =ABC[(b - 1)];
                    ABC[b - 1]=ABC[(b)];
                    ABC[b]=newString;


                }
            }
        }
        System.out.print("\nNew Array ");
        for (int i = 0; i < size; i++)
            System.out.print(ABC[(i)]);
    }
}
