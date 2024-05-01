public class MathUtils {
    public static int add(int a, int b) {
        // Додавання двох чисел
        return a + b;
    }

    public static int subtract(int a, int b) {
        // Віднімання другого числа від першого
        return a - b;
    }

    public static int divide(int a, int b) {
        // Ділення першого числа на друге
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
    }

    public static void main(String[] args) {
        // Приклади використання методів
        int resultAdd = MathUtils.add(10, 5);
        System.out.println("Result of addition: " + resultAdd);

        int resultSubtract = MathUtils.subtract(10, 5);
        System.out.println("Result of subtraction: " + resultSubtract);

        int resultDivide = MathUtils.divide(10, 5);
        System.out.println("Result of division: " + resultDivide);
    }
}