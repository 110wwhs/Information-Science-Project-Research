public class Cuboid extends Rectangle {
    private double height;
    public Cuboid() {
    }

    public Cuboid(double height) {
        this.height = height;
    }
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
