package GShildt.Chapter_6;

public class Test {
    int a,b;

    Test(int i,int y){
        a = i;
        b= y;
    }

    void change( Test ob){
        ob.a=ob.a+ob.b;
        ob.b = -ob.b;
    }
}


class CallByRef{
    public static void main(String[] args) {
        Test ob = new Test(15,20);

        System.out.println("Before Method" + " ob.a :" + ob.a+ " ob.b :"
         +ob.b);

            ob.change(ob);

        System.out.println("After  Method" + " ob.a :" + ob.a+ " ob.b :"
                +ob.b);

    }

}