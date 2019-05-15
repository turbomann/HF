package GShildt.Chapter_5;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java is a leamd of internet";
        String str2 = new String(str1);
        String str3 = "String in java are very effectifness";

        int result, idx;
        char ch;
        System.out.println("Dlinna stroki str1 " + str1.length());
        for (int i = 0; i < str1.length(); i++)
            System.out.println("Display the string by symbol - " + str2.charAt(i));
        System.out.println();


        if (str1.equals(str2)) System.out.println("str1 = str2");
        else System.out.println("str1 != str2");


        if (str1.equals(str3)) System.out.println("str1 = str3");
        else System.out.println("str1 != str3");

        result = str1.compareTo(str3);
        if (result == 0) System.out.println(str1 = str3);
        else if (result < 0) System.out.println("str1 < str3");
        else System.out.println("str1 > str3");

str2 =  "New line for str2 New line for str2";

    idx = str2.indexOf("line");
        System.out.println("index line = " + idx);

        idx=str2.lastIndexOf("for");
        System.out.println("last index for - for - "+idx);

    }
}
