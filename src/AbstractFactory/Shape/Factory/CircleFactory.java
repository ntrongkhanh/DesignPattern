package AbstractFactory.Shape.Factory;


import AbstractFactory.Shape.Shape.Circle;
import AbstractFactory.Shape.Shape.Shape;

public class CircleFactory implements ShapeAbstractFactory {

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
