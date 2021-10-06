package prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 3);
        System.out.println("Drawing original object");
        circle.draw();
        System.out.println("-------------------------------------------------------------------------");
//        Circle deepCopyCircle = new Circle(circle);
        Circle deepCopyCircle=circle.clone();
        System.out.println("Drawing deep copy object");
        deepCopyCircle.draw();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Modifying deep copy object");
        deepCopyCircle.setX(20);
        System.out.println("\n\nDrawing original object");
        circle.draw();
        System.out.println("Drawing deep copy object");
        deepCopyCircle.draw();
        System.out.println("-------------------------------------------------------------------------");

//        Circle copyCire = circle;
//        System.out.println("Drawing copy object");
//        copyCire.draw();
//        System.out.println("Modifying copy object");
//        copyCire.setX(30);
//        System.out.println("\n\nDrawing original object");
//        circle.draw();
//        System.out.println("Drawing deep copy object");
//        copyCire.draw();

    }
}
