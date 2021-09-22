package FactoryMethod;


import FactoryMethod.Shape.Circle;
import FactoryMethod.Shape.Rectangle;
import FactoryMethod.Shape.Shape;
import FactoryMethod.Shape.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Circle circle=new Circle();
//        Shape rectangle=new Rectangle();
//        Shape triangle=new Triangle();
//
//        circle.draw();
//        rectangle.draw();
//        triangle.draw();

////////////////////////
        Shape shape=null;
        System.out.println("Nhập tên hình:");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        if (input.equalsIgnoreCase("circle")){
            shape=new Circle();
        }else if (input.equalsIgnoreCase("rectangle")){
            shape=new Rectangle();
        }else {
            shape=new Triangle();
        }

        shape.draw();
//////////////////////////////

//        System.out.println("Nhập tên hình:");
//        Scanner scanner=new Scanner(System.in);
//        String input1=scanner.nextLine();
//        String input2=scanner.nextLine();
//        String input3=scanner.nextLine();
//
//        Shape shape1=ShapeFactory.getShape(input1);
//        Shape shape2=ShapeFactory.getShape(input2);
//        Shape shape3=ShapeFactory.getShape(input3);
//
//        shape1.draw();
//        shape2.draw();
//        shape3.draw();

    }
}
