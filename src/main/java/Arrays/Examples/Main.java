package Arrays.Examples;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String , Pet> hashMap = new HashMap<>();
        hashMap.put("Cat", new Cat("Murs"));
        hashMap.put("Dog", new Dog("Bob"));
        hashMap.put("{Parrot", new Parrot("Kesh"));

        System.out.println(hashMap);
        System.out.println("##########################");

        Pet cat = hashMap.get("Cat");
        System.out.println(cat);
        System.out.println(hashMap.containsKey("Cat"));
        System.out.println(hashMap.containsValue(cat));


    }
}
