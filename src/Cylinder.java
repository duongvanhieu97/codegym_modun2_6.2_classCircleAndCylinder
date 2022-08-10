public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVCylinder() {
        return (this.getArea() * height);
    }
    public double getAroundCylinder() {
        return (this.getPerimeter() * height);
    }
    public double getTotality() {
        return (2* this.getArea() + this.getAroundCylinder());
    }
    @Override
    public String toString() {
        return "Diện tích xung quanh = " + getAroundCylinder() + ", Thể tích hình trụ = " + getVCylinder() + ", Diện tích toàn phần = " + getTotality()
                + super.toString();
    }
}
