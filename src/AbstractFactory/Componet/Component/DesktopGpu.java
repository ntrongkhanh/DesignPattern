package AbstractFactory.Componet.Component;

public class DesktopGpu implements Gpu{
    @Override
    public void getName() {
        System.out.println("This is Desktop GPU");
    }
}
