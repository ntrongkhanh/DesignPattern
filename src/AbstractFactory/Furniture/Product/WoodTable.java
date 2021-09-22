package AbstractFactory.Furniture.Product;


public class WoodTable implements Table {
    @Override
    public void getName() {
        System.out.println("This is wood table");
    }
}
