package AbstractFactory.Shape.Factory;


import AbstractFactory.Shape.Shape.Rectangle;
import AbstractFactory.Shape.Shape.Shape;

public class RectangleFactory implements ShapeAbstractFactory{

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
