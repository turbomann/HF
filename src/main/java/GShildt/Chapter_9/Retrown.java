package src.main.java.GShildt.Chapter_9;

public class Retrown {
    public static void getExcepriot(){

        int nums1[] = {1,3,4,2,3,4,5,6};
        int nums2[] = {1,2,0,4,5,6};
        for(int i =0;i<nums1.length;i++){
            try{
                System.out.println(nums1[i]/nums2[i]);
            }catch(ArithmeticException ex){
                System.out.println("divade by zeero");
            }
            catch (ArrayIndexOutOfBoundsException ex0){
                System.out.println("Alarma element can't be found");
                throw ex0;
            }

        }

    }
}

class RethrowDemo{
    public static void main(String[] args) {
try {
    Retrown.getExcepriot();

} catch (ArrayIndexOutOfBoundsException ex0){
    System.out.println("WE DID IT!");
}
    }
}

