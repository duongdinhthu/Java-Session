package edunextS73;

import edunextS72.MovablePoint;

public class TestMovable {
    public static void main(String[] args) {
          MovableCircle movableCircle = new MovableCircle(1,1,1,2,2);

            System.out.println("Initial position: (" + movableCircle.getX() + ", " + movableCircle.getY() + ")");
            movableCircle.moveUp();

            System.out.println("After moving up: (" + movableCircle.getX() + ", " + movableCircle.getY() + ")");

            movableCircle.moveRight();
            System.out.println("After moving right: (" + movableCircle.getX() + ", " + movableCircle.getY() + ")");
    }
}
