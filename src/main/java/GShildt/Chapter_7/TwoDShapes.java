package GShildt.Chapter_7;

 class TwoDShapes {

    private double width;
    private double height;
    private String name;


    TwoDShapes(double x, String n) {

        width = height = x;
        name = n;
    }

    TwoDShapes() {
        width = height = 0;
        name = "none";

    }

    TwoDShapes(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShapes(TwoDShapes ob) {
        height = ob.height;
        width = ob.width;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double w) {
        width = w;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Wight and Height " + width + " :" + height);
    }

  double area(){
      return 1;


  }

}

class Triangle extends TwoDShapes {
    private String style;

    Triangle(double x) {
        super(x, "Triangle");
        style = "Filled";

    }


    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "Triangle");
        style = s;

    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle :" + style);
    }

}

class Rectangle extends TwoDShapes {
    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "Rectangle");
    }

    Rectangle(double x) {
        super(x, "Rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        else
            return false;
    }
double area(){
       return getHeight() * getWidth();
}
}






class Circle extends TwoDShapes{
     double pi = 3.14;
     Circle(double x){
         super(x,"Circle");
     }

     double area() {
         return getHeight()*2*pi;

     }
}

class TestAfter7{
    public static void main(String[] args) {
        TwoDShapes c = new Circle(12);
        System.out.println(c.area()+c.getName());
    }
}

class AbsShape{
    public static void main(String[] args) {
        TwoDShapes shapes [] = new TwoDShapes[4];
        shapes[0] = new Triangle("Kontured",8.0,12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7);

        for (int i =0; i<shapes.length;i++){
            System.out.println("The object "+ shapes[i].getName());
            System.out.println("The Area "  + shapes[i].area());
            System.out.println();
        }
    }
    }



//class DynShapes{
//    public static void main(String[] args) {
//        TwoDShapes shapes [] = new TwoDShapes[5];
//        shapes[0] = new Triangle("Kontured",8.0,12.0);
//        shapes[1] = new Rectangle(10);
//        shapes[2] = new Rectangle(10,4);
//        shapes[3] = new Triangle(7);
//        shapes[4] = new TwoDShapes(10,20,"Figure" );
//
//        for (int i =0; i<shapes.length;i++){
//            System.out.println("The object "+ shapes[i].getName());
//            System.out.println("The Area "  + shapes[i].area());
//            System.out.println();
//        }
//    }
//
//}

class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color = " + color);
    }
}


class Shape7 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Cont", 8.0, 12.0);
        Triangle t2 = new Triangle(t1);

        System.out.println(" Info about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println(" Ploshad : " + t1.area());
        System.out.println();

        System.out.println(" Info about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println(" Ploshad : " + t2.area());
    }
}


class Shape6 {
    public static void main(String[] args) {
        ColorTriangle ct1 = new ColorTriangle("Blue ", " Kontured ", 8.0, 12.0);
        ColorTriangle ct2 = new ColorTriangle("Red ", " Filled ", 2.0, 2.0);

        System.out.println(" Info about ct1: ");
        ct1.showStyle();
        ct1.showDim();
        ct1.showColor();
        System.out.println(" Ploshad : " + ct1.area());
        System.out.println();

        System.out.println(" Info about ct2: ");
        ct2.showStyle();
        ct2.showDim();
        ct2.showColor();
        System.out.println(" Ploshad : " + ct2.area());
    }
}


class Shape3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("Konturniy", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);
        t1 = t2;


        System.out.println("Info about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Ploshad : " + t1.area());

        System.out.println();

        System.out.println("Info about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Ploshad : " + t2.area());

        System.out.println();

        System.out.println("Info about t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Ploshad : " + t3.area());

    }


}