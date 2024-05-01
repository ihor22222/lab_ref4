public class MathOperations {
    public double calculateResult(double x, double y) {
        double xy = x * y;
        double twoX = 2 * x;
        double threeY = 3 * y;
        double sqrtXY = Math.sqrt(x + y);

        double result = xy + twoX - threeY + sqrtXY;
        return result;
    }
}
