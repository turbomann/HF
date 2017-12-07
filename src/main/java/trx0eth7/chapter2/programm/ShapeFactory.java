package trx0eth7.chapter2.programm;

import trx0eth7.chapter2.programm.model.Shape;

interface ShapeFactory<S extends Shape> {
    S build();
}
