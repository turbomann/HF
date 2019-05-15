package turbomann.Chapter_10;

public  class StaticTest extends StaticSuper{
    static int rand;
    static {
        rand = (int)(Math.random()*6);
        System.out.println("Static blog"  + rand) ;
    }

    StaticTest(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println(("IN main"));
        StaticTest st = new StaticTest();
    }
}
