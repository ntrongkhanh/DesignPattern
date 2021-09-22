package AbstractFactory.Componet.Component;

public class LaptopGpu implements Gpu{
    @Override
    public void getName() {
        System.out.println("This is Laptop GPU");
    }
}
