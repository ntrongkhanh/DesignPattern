package prototype;

public class Circle implements Cloneable {
    private int radius;
    private int x;
    private int y;

    void draw() {
        System.out.printf("Drawing Circle (%s).\n", this.toString());
    }

    public Circle(Circle circle) {
        this();
        System.out.println("calling prototype");
        this.radius = circle.radius;
        this.x = circle.x;
        this.y = circle.y;
    }

    @Override
    protected Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + " ,y=" + y + " ,radius=" + radius;
    }
}
