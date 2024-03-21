public class ShapeTest {
    public static void main(String[] args) {
        // Shape s = new Shape(); // Error: Shape is abstract; cannot be instantiated

        Circle c1 = new Circle(10.0);
        Cylinder cy1 = new Cylinder(10.0, 5.0);
        Cuboid cu1 = new Cuboid(10.0, 10.0, 5.0);
        System.out.println(cu1.getVolume());
        System.out.println(cy1.getVolume());
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
