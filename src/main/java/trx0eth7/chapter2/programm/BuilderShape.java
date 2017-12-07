package trx0eth7.chapter2.programm;

import trx0eth7.chapter2.programm.model.MCircle;
import trx0eth7.chapter2.programm.model.MSquare;
import trx0eth7.chapter2.programm.model.MTriangle;
import trx0eth7.chapter2.programm.model.Shape;

public class BuilderShape{

    //FIXME NPE: if ShapeFactory == null -> getDefaultShape()
    public static Shape createShape(String typeShape){

        ShapeFactory<? extends Shape> shapeFactory = null;
        if(typeShape.equals("circle")){
            shapeFactory = MCircle::new;
        }
        if(typeShape.equals("square")){
            shapeFactory = MSquare::new;
        }
        if(typeShape.equals("triangle")){
            shapeFactory = MTriangle::new;
        }
        assert shapeFactory != null;
        return shapeFactory.build();
    }


}
