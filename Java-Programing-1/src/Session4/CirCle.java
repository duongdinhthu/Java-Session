package Session4;

public class CirCle {
    private double radius;
    private String color;
    public CirCle(){

    }
    public CirCle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
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

}
