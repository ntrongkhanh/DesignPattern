package FactoryMethod.Shape.Factory;

import FactoryMethod.Shape.Shape.Shape;

public interface Factory {
    public  Shape getShape(String shapeType) ;
}
