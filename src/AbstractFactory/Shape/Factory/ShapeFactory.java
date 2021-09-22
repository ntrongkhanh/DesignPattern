package AbstractFactory.Shape.Factory;

public class ShapeFactory {
    public static ShapeAbstractFactory getFactory(String factoryType){
        if (factoryType ==null){
            return null;
        }
        if (factoryType.equalsIgnoreCase("circle")){
            return new CircleFactory();
        }else if (factoryType.equalsIgnoreCase("rectangle")){
            return new RectangleFactory();
        }else if (factoryType.equalsIgnoreCase("triangle")){
            return new TriangleFactory();
        }else {
            return null;
        }
    }
}