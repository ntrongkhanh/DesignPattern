package FactoryMethod.Shape;


import FactoryMethod.Shape.Factory.Factory;
import FactoryMethod.Shape.Factory.ShapeFactory;
import FactoryMethod.Shape.Shape.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Shape shape=null;
//        System.out.println("Nhập tên hình:");
//        Scanner scanner=new Scanner(System.in);
//        String input=scanner.nextLine();
//
//        if (input.equalsIgnoreCase("circle")){
//            shape=new Circle();
//        }else if (input.equalsIgnoreCase("rectangle")){
//            shape=new Rectangle();
//        }else {
//            shape=new Triangle();
//        }
//
//        shape.draw();
//////////////////////////////

        System.out.println("Nhập tên hình:");
        Scanner scanner=new Scanner(System.in);
        String input1=scanner.nextLine();
        String input2=scanner.nextLine();
        String input3=scanner.nextLine();

        Factory factory=new ShapeFactory();
        Shape shape1=factory.getShape(input1);
        Shape shape2=factory.getShape(input2);
        Shape shape3=factory.getShape(input3);

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
