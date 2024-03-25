package Session4;

import java.awt.geom.Area;

public abstract class CirCle {
    private double radius;
    private String color;
    private String area;
    public CirCle(){
    this.area = getAreaCircle();
    }
    public CirCle(double radius,String color){
        this.radius = radius;
        this.color = color;
        this.area= area;
    }
    public double getRadius() {

        return radius;
    }

    public String getColor() {

        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "CirCle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public abstract String getAreaCircle();

}
