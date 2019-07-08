//package src.main.java.Arrays;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class HeshMapTest<hashMap> {
//
//    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Vasya", 10);
//        hashMap.put("Petya", 11);
//        hashMap.put("Maria", 12);
//        hashMap.put("Maruv", 13);
//
//        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
//        for (Map.Entry<String, Integer> me : set) {
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//        }
//
//        int value = hashMap.get("Petya");
//        hashMap.put("Petya", value + 3);
//        System.out.println("Petya stal -> " + hashMap.get("Petya"));
//
//    }
//
//}
