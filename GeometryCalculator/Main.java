public class Main {
    public static void main(String[] args) {
        GeometryCalculator circle = new GeometryCalculator();
        System.out.println("Площадь круга: "  + GeometryCalculator.getCircleSquare(20.0));
        System.out.println("Объем шара: " + GeometryCalculator.getSphereVolume(2.0));
        System.out.println("Площадь треугольника: " + GeometryCalculator.getTriangleSquare(8,8,8));
        System.out.println(GeometryCalculator.isTrianglePossible(1,1,1));
     }
}
