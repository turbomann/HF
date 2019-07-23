package src.main.java.GShildt.Chapter_9;

public class ExTest5 {
    public static void main(String[] args) {
        int nums1[] = {1,3,4,2,3,4,5,6};
        int nums2[] = {1,2,0,4,0,6};
        for(int i =0;i<nums1.length;i++){
            try{
                System.out.println(nums1[i]/nums2[i]);
            } catch (ArrayIndexOutOfBoundsException tr){
                System.out.println("Vozniklo iscluchenie");
            } catch(Throwable ex){
                System.out.println("Vixod za grannizy");
            }

        }

    }
}
