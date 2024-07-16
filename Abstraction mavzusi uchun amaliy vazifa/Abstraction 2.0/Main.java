public class Main {
    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle(3, 4, 5);
        GeometricFigure trapezium = new Trapezium(3, 4, 2);
        GeometricFigure rectangle = new Rectangle(4, 5);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Trapezium area: " + trapezium.area());
        System.out.println("Trapezium perimeter: " + trapezium.perimeter());

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
    }
}
