package AbstractFactory.Componet.Factory;

import AbstractFactory.Componet.Component.Cpu;
import AbstractFactory.Componet.Component.Gpu;
import AbstractFactory.Componet.Component.Ram;

public interface ComponentAbstractFactory {

    public Cpu createCpu();

    public Ram createRam();

    public Gpu createGpu();
}
