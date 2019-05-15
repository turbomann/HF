package GShildt.Chapter_5;

import jdk.nashorn.internal.ir.IfNode;

public class SimpleTest {
    public static void main(String[] args) {
        String str1 = "nabma";
        for (int i =0;i<str1.length();i++){
            System.out.print(str1.charAt(i));

        }
        char f= 'F';
       int c=  str1.indexOf('a');
            System.out.println(c);

    }
}
