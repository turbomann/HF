package trx0eth7.chapter2.programm.builder;

import trx0eth7.chapter2.programm.model.IShape;

interface ShapeFactory<S extends IShape> {
    S build();
}
