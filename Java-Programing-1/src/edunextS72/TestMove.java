package edunextS72;

public class TestMove {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0);
        System.out.println("Initial position: (" + point.getX() + ", " + point.getY() + ")");

        point.moveUp();
        System.out.println("After moving up: (" + point.getX() + ", " + point.getY() + ")");

        point.moveRight();
        System.out.println("After moving right: (" + point.getX() + ", " + point.getY() + ")");
    }
}
