package Shape;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        // return getArea() * height;
        return Math.PI * radius * radius * height; // protected radius from Shape.Shape.Circle
    }


}