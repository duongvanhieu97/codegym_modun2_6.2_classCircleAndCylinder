public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3);
        System.out.println(cylinder);
        cylinder = new Cylinder(3, "Red", 4);
        System.out.println(cylinder);
    }
}
