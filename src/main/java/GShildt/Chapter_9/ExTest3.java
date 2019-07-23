package src.main.java.GShildt.Chapter_9;

public class ExTest3 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 5, 6, 7, 8};
        int nums2[] = {0, 3, 0, 5, 6, 0, 8};
        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] / nums2[i]);
            } catch(ArithmeticException ex){
                System.out.println("Popitka delenia na null");
            }
        }
    }
}
