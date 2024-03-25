package edunextS73;

public class MovableCircle extends MovablePoint{
    private int radius;
    public MovableCircle(int radius,int x, int y , int xSpeed, int ySpeed){
        super(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                '}';
    }
}
