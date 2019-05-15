package GShildt.Chapter_5;

public class SringArrays {
    public static void main(String[] args) {
        String str[] = {"This","line","is", "test"};

        System.out.println("Current array + ");
        for (String s :str)
            System.out.print(s+" ");
            System.out.println("\n");

            str[2] = "The same";
            str[3]="test";


            System.out.println("changed massive: ");
            for (String s : str)
                System.out.print(s+" ");

            }
        }


