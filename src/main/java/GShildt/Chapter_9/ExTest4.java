package src.main.java.GShildt.Chapter_9;

public class ExTest4 {
    public static void main(String[] args) {
        int nums1[] = {1,3,4,2,3,4,5,6};
        int nums2[] = {1,2,0,4,5,6};
        for(int i =0;i<nums1.length;i++){
            try{
                System.out.println(nums1[i]/nums2[i]);
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Vixod za grannizy");
            }
            catch (ArithmeticException ex0){
                System.out.println("divade by zeero");
            }

        }

    }
}
