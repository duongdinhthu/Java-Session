package Session4.Cylinder;


import Session4.CirCle;

public class Cylinder extends CirCle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String getAreaCircle() {
        return "Area results";
    }
}
