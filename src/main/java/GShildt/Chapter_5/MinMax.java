package GShildt.Chapter_5;

public class MinMax {
    public static void main(String[] args) {
        int array[] = new int[10];
        int min, max;
        array[0] = -12;
        array[1] = -12;
        array[2] = -12;
        array[3] = -12;
        array[4] = -12;
        array[5] = 112;
        array[6] = 412;
        array[7] = 12;
        array[8] = -132;
        array[9] = -122;
min=max=array[0];
        for(int i=0; i<10; i++){

            if (array[i]<min) min = array[i];
            if (array[i]>max) max = array[i];

        }

        System.out.println("min = "+ min +"\n" + "max = "+ max);
    }
}
