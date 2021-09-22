package AbstractFactory.Componet.Factory;

import AbstractFactory.Componet.Component.*;

public class DesktopComponentFactory implements ComponentAbstractFactory {


    @Override
    public Cpu createCpu() {
        return new DesktopCpu();
    }

    @Override
    public Ram createRam() {
        return new DesktopRam();
    }

    @Override
    public Gpu createGpu() {
        return new DesktopGpu();
    }
}
