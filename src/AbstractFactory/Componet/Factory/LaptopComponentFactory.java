package AbstractFactory.Componet.Factory;

import AbstractFactory.Componet.Component.*;

public class LaptopComponentFactory implements ComponentAbstractFactory {
    @Override
    public Cpu createCpu() {
        return new LaptopCpu();
    }

    @Override
    public Ram createRam() {
        return new LaptopRam();
    }

    @Override
    public Gpu createGpu() {
        return new LaptopGpu();
    }
}
