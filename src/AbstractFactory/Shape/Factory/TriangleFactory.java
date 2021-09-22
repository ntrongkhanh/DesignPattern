package AbstractFactory.Shape.Factory;


import AbstractFactory.Shape.Shape.Shape;
import AbstractFactory.Shape.Shape.Triangle;

public class TriangleFactory implements ShapeAbstractFactory{

    @Override
    public Shape getShape() {
        return new Triangle();
    }
}
