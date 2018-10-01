package turbomann.JFF;

public class Dog {
    String name;


        void wholePet (String poroda, String color)
        {
           System.out.println(poroda +" "+ " " +color);

        }

}

class test {
    public static void main(String[] args) {
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Uvelka";

        myDogs[0].wholePet( "OVCHARKE", "ReDMOND");



        System.out.println();
    }
}