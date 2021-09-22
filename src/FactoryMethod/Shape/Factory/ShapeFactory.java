package FactoryMethod.Shape.Factory;



import FactoryMethod.Shape.Shape.Circle;
import FactoryMethod.Shape.Shape.Rectangle;
import FactoryMethod.Shape.Shape.Shape;
import FactoryMethod.Shape.Shape.Triangle;

public class ShapeFactory implements Factory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("triangle")){
            return new Triangle();
        }
        return null;
    }
}
