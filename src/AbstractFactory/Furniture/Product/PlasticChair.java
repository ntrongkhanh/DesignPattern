package AbstractFactory.Furniture.Product;


public class PlasticChair implements Chair {
    @Override
    public void getName() {
        System.out.println("This is plastic chair");
    }
}
