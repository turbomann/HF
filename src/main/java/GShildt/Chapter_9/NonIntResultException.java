package src.main.java.GShildt.Chapter_9;

public class NonIntResultException extends Exception {
    int n, d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Reuslt of devide " + n + "/ " + d + " \n non full of number";

    }
}

class CustomExcDemo {
    public static void main(String[] args) {
        int numer[] = {1, 2, 343, 4, 5, 6, 7, 7};
        int demo[] = {0, 2, 4, 0, 7};

        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0)
                    throw new NonIntResultException(numer[i], demo[i]);
                System.out.println("devide numer[i]/demo[i] is equals = " + numer[i] / demo[i]);
            } catch (ArithmeticException e) {
                System.out.println("Trying devide by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("element not found");
            } catch (NonIntResultException e) {
                System.out.println(e);
            }
        }

    }
}
