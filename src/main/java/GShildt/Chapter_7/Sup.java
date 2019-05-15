package GShildt.Chapter_7;

public class Sup {
    void who() {
        System.out.println("Who() in Sup");
    }
}

class Sup1 extends Sup {
    void who() {
        System.out.println("Who() in Sup1");
    }
}


class Sup2 extends Sup {
    void who() {
        System.out.println("Who() in Sup2");
    }
}


class DynDespDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sup1 superOb1 = new Sup1();
        Sup2 superOb2 = new Sup2();


        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = superOb1;
        supRef.who();

        supRef = superOb2;
        supRef.who();

    }
}