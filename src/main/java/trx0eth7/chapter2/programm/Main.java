package trx0eth7.chapter2.programm;

import trx0eth7.chapter2.programm.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        Main main = new Main();
        List<Shape> shapes = main.init();
        for(Shape shape : shapes){
            shape.rotate();
            shape.playSound();
        }
    }

    List<Shape> init(){
        //User set shapes
        List<Shape> shapes = new ArrayList<>();

        shapes.add(BuilderShape.createShape("circle"));
        shapes.add(BuilderShape.createShape("square"));
        shapes.add(BuilderShape.createShape("triangle"));

        return shapes;
    }

}
