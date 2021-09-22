package FactoryMethod;


import FactoryMethod.Shape.Circle;
import FactoryMethod.Shape.Rectangle;
import FactoryMethod.Shape.Shape;
import FactoryMethod.Shape.Triangle;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
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
