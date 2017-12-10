package trx0eth7.chapter2.programm.builder;

import trx0eth7.chapter2.programm.model.MCircle;
import trx0eth7.chapter2.programm.model.MSquare;
import trx0eth7.chapter2.programm.model.MTriangle;
import trx0eth7.chapter2.programm.model.IShape;

public class BuilderShape{

    //FIXME NPE: if ShapeFactory == null -> getDefaultShape()
    public static IShape createShape(String typeShape){

        ShapeFactory<? extends IShape> shapeFactory = null;
        if(typeShape.equalsIgnoreCase("circle")){
            shapeFactory = MCircle::new;
        }
        if(typeShape.equalsIgnoreCase("square")){
            shapeFactory = MSquare::new;
        }
        if(typeShape.equalsIgnoreCase("triangle")){
            shapeFactory = MTriangle::new;
        }
        assert shapeFactory != null;
        return shapeFactory.build();
    }


}
