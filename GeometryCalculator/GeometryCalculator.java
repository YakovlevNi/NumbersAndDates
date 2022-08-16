import java.math.BigDecimal;

public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double result = Math.PI * (Math.pow(radius, 2));

        return result;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        double result = (Math.PI * 4 / 3) * (Math.pow(radius, 3));

        return result;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        boolean result;
        if (a + b < c || a + c < b || b + c < a) {
            result = false;
            System.out.println("Невозможно построить треугольник");
           }else {
            result =true;
            System.out.println("Треугольник простроить возможно");
        }
        return result;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double preResult = (a + b + c) / 2;
        double formula = preResult * ((preResult - a) * (preResult - b) * (preResult - c));
        double result = Math.sqrt(formula);
        return result;
    }
}
