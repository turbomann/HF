package GShildt.Chapter_5;

public class Ragged {
    public static void main(String[] args) {
        int ridders[][] = new int[7][];
        ridders[0] = new int[10];
        ridders[1] = new int[10];
        ridders[2] = new int[10];
        ridders[3] = new int[10];
        ridders[4] = new int[10];
        ridders[5] = new int[2];
        ridders[6] = new int[2];
        int i, j;

        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++) {
                ridders[i][j] = i + j + 10;
            }

        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++) {
                ridders[i][j] = i + j + 10;
            }

        System.out.println("Count of users in BUDEN ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.println(ridders[i][j] + " ");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Count of users in WEEKEND ");
        for (i=5;i<7;i++){
            for (j=0;j<2;j++){
                System.out.println(ridders[i][j]+"");
                System.out.println();
            }
        }
    }
}
