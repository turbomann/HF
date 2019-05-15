package GShildt.Chapter_5;

public class TwoD
{

    public static void main(String[] args) {
        int i,t;
        int table [][] = new int [3][4];

        for (i=0;i<3;i++)
            for (t=0;t<4;t++){
                table[i][t]= (t*4) + i+1;
                System.out.print(table[i][t]+" ");


            }
        System.out.println();
    }
}
