package GShildt.Chapter_5;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {1, 0, -12, 1, 100,12};
        int a, t, b, size;
        size = nums.length;
        System.out.println("Current Array ");
        for(int i = 0; i<size;i++)
        System.out.print(nums[i]+ " ");
        System.out.println("\n################");

        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        System.out.println("New Array ");
        for(int i = 0; i<size;i++)
            System.out.print(nums[i]+ " ");
    }
}
