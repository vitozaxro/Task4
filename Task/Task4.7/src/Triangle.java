import java.awt.*;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }


    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }


    public Point calculateCentroid() {
        double x = (1.0 / 3.0) * (0 + sideA + sideB);
        double y = (1.0 / 3.0) * (0 + Math.sqrt(Math.pow(sideA, 2) - Math.pow(x, 2)) + Math.sqrt(Math.pow(sideB, 2) - Math.pow(x, 2)));
        return new Point((int) x, (int) y);
    }
}