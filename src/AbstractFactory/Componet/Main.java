package AbstractFactory.Componet;

import AbstractFactory.Componet.Component.Cpu;
import AbstractFactory.Componet.Component.Gpu;
import AbstractFactory.Componet.Component.Ram;
import AbstractFactory.Componet.Factory.ComponentAbstractFactory;
import AbstractFactory.Componet.Factory.ComponentFactory;
import AbstractFactory.Componet.Factory.DesktopComponentFactory;
import AbstractFactory.Componet.Factory.LaptopComponentFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhập loại máy tính (laptop/desktop):");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        ComponentAbstractFactory factory=null;
        if (input.equalsIgnoreCase("laptop")){
            factory=new LaptopComponentFactory();
        }else if (input.equalsIgnoreCase("desktop")){
            factory=new DesktopComponentFactory();
        }


        Ram ram=factory.createRam();
        Cpu cpu=factory.createCpu();
        Gpu gpu=factory.createGpu();

        ram.getName();
        cpu.getName();
        gpu.getName();


//
//        ComponentAbstractFactory factory= ComponentFactory.getComputerType(input);
//
//        Ram ram=factory.createRam();
//        Cpu cpu=factory.createCpu();
//        Gpu gpu=factory.createGpu();
//
//        ram.getName();
//        cpu.getName();
//        gpu.getName();
//

    }
}
