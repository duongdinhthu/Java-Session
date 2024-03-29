import java.util.Scanner;

class InvalidTriangleException extends Exception {
    public InvalidTriangleException(String message) {
        super(message);
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Triangle[] triangles = new Triangle[5];

            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Enter the edges of triangle " + (i + 1) + ":");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    triangles[i] = new Triangle(side1, side2, side3);
                }

                System.out.println("Area of the fifth triangle: " + triangles[4].calculateArea());
            } catch (InvalidTriangleException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
}

class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws InvalidTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new InvalidTriangleException("Invalid triangle edges");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
