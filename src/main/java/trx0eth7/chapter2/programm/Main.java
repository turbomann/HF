package trx0eth7.chapter2.programm;

import trx0eth7.chapter2.programm.model.*;
import java.util.ArrayList;
import java.util.List;

import static trx0eth7.chapter2.programm.builder.BuilderShape.createShape;

public class Main {
    public static void main(String... args) {
        Main main = new Main();
        List<IShape> shapes = main.init();
        for(IShape shape : shapes){
            shape.rotate();
            shape.playSound();
        }
    }

    private List<IShape> init(){
        //User set shapes
        List<IShape> shapes = new ArrayList<>();

        shapes.add(createShape("circle"));
        shapes.add(createShape("square"));
        shapes.add(createShape("triangle"));

        return shapes;
    }

}
