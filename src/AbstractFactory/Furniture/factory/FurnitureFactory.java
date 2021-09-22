package AbstractFactory.Furniture.factory;

public class FurnitureFactory {
    public static FurnitureAbstractFactory getFactory(String factoryType){
        if (factoryType ==null){
            return null;
        }
        if (factoryType.equalsIgnoreCase("plastic")){
            return new PlasticFactory();
        }else if (factoryType.equalsIgnoreCase("wood")){
            return new WoodFactory();
        }else {
            return null;
        }
    }
}
