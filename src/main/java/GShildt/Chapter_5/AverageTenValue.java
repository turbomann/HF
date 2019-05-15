package GShildt.Chapter_5;

public class AverageTenValue {
    public static void main(String[] args) {
        double array [] = {1.1,2.2,3,4,5,6,7,8,9,10};
        double summ=0;
        for (int i =0; i<array.length;i++){
            summ =( summ+array[i]);
        }
        System.out.println(summ/array.length);
    }
}
