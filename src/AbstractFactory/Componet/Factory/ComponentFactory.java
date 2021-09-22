package AbstractFactory.Componet.Factory;

public class ComponentFactory {
    public static ComponentAbstractFactory getComputerType(String componentType) {
        if (componentType == null) {
            return null;
        }
        if (componentType.equalsIgnoreCase("laptop")) {
            return new LaptopComponentFactory();
        } else if (componentType.equalsIgnoreCase("desktop")) {
            return new DesktopComponentFactory();
        } else {
            return null;
        }
    }
}
