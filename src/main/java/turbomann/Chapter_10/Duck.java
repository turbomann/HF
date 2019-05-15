package turbomann.Chapter_10;

public class Duck {
     public static void main(String[] args) {
         System.out.println(cat.counter);

         cat ooo = new cat("vasa");

         System.out.println(cat.counter);
}

}
class cat {
    private String name;
    static int counter = 0;

    cat (String n){
        name = n;
        counter++;
    }}

