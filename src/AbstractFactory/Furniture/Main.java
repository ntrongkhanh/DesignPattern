package AbstractFactory.Furniture;


import AbstractFactory.Furniture.Product.Chair;
import AbstractFactory.Furniture.Product.Table;
import AbstractFactory.Furniture.factory.FurnitureAbstractFactory;
import AbstractFactory.Furniture.factory.FurnitureFactory;
import AbstractFactory.Furniture.factory.PlasticFactory;
import AbstractFactory.Furniture.factory.WoodFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory plasticFactory=new PlasticFactory();
        Chair plasticChair=plasticFactory.createChair();
        Table plasticTable=plasticFactory.createTable();

        FurnitureAbstractFactory woodFactory=new WoodFactory();
        Chair woodChair=woodFactory.createChair();
        Table woodTable=woodFactory.createTable();

        plasticChair.getName();
        plasticTable.getName();
        woodChair.getName();
        woodTable.getName();

//////////////////////////////

//        System.out.println("Nhập chất liệu:");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        FurnitureAbstractFactory factory=null;
//        if (input.equalsIgnoreCase("plastic")){
//            factory=new PlasticFactory();
//        }else {
//            factory=new WoodFactory();
//        }
//
//        Chair chair=factory.createChair();
//        Table table=factory.createTable();
//        chair.getName();
//        table.getName();


////////////////////////

//        System.out.println("Nhập chất liệu:");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        FurnitureAbstractFactory factory= FurnitureFactory.getFactory(input);
//        Chair chair=factory.createChair();
//        Table table=factory.createTable();
//        chair.getName();
//        table.getName();

    }
}
