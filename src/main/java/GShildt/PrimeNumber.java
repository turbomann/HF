package GShildt;

public class PrimeNumber {

    public static void main(String[] args) {
        int i,j;
        boolean isPrime;
                for (i = 2  ; i < 101; i++) {
                    isPrime = true;

                    for (j=2; j<=i/j;j++){
                        if((i%j)==0){      isPrime = false;
                        }
                    }
                    if(isPrime){
                        System.out.println(i+ " Is prime number");
                }
    }
}
}
