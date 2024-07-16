public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double area() {
        return (sideA + sideB) * high / 2;
    }

    @Override
    public double perimeter() {
        double sideC = Math.sqrt(((sideB - sideA) / 2) * ((sideB - sideA) / 2) + high * high);
        return sideA + sideB + 2 * sideC;
    }
}
