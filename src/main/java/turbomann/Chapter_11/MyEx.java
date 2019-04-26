package turbomann.Chapter_11;

 class MyEx extends Exception {

     static void doRisky(String t) throws MyEx {


         System.out.print("t");
         System.out.print("a");
         System.out.print("r");
         System.out.print("o");
         System.out.print("w");
         System.out.print("s");
     }


     public class ExTestDrive {
         public void main(String[] args) {
             String test = args[0];
             try {
                 doRisky(test);
             } catch (MyEx e) {

             }
         }
     }
 }


