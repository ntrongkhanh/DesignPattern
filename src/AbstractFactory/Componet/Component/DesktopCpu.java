package AbstractFactory.Componet.Component;

public class DesktopCpu implements Cpu{
    @Override
    public void getName() {
        System.out.println("This is Desktop CPU");
    }
}
