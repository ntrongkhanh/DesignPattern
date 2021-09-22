package AbstractFactory.Shape;


import AbstractFactory.Shape.Factory.*;
import AbstractFactory.Shape.Shape.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Shape circle = new CircleFactory().getShape();
//        Shape rectangle = new RectangleFactory().getShape();
//        Shape triangle = new TriangleFactory().getShape();
//
//
//        circle.draw();
//        rectangle.draw();
//        triangle.draw();

////////////////////////////////////

        System.out.println("Nhập tên hình:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ShapeAbstractFactory shapeFactory=null;
        if (input.equalsIgnoreCase("circle")){
            shapeFactory=new CircleFactory();
        }else if (input.equalsIgnoreCase("rectangle")){
            shapeFactory=new RectangleFactory();
        }else if (input.equalsIgnoreCase("triangle")){
            shapeFactory= new TriangleFactory();
        }

        Shape shape=shapeFactory.getShape();
        shape.draw();

///////////////////////////////////////


//
//        System.out.println("Nhập tên hình:");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        ShapeAbstractFactory shapeFactory = ShapeFactory.getFactory(input);
//
//        Shape shape=shapeFactory.getShape();
//
//        shape.draw();

    }
}
